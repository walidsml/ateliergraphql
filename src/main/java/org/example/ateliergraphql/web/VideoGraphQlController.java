package org.example.ateliergraphql.web;

import org.example.ateliergraphql.dao.entity.Creator;
import org.example.ateliergraphql.dao.entity.CreatorRequest;
import org.example.ateliergraphql.dao.entity.Video;
import org.example.ateliergraphql.dao.entity.VideoRequest;
import org.example.ateliergraphql.dao.repository.CreatorRepository;
import org.example.ateliergraphql.dao.repository.VideoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VideoGraphQlController {

    private final CreatorRepository creatorRepository;
    private final VideoRepository videoRepository;

    public VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }

    @QueryMapping
    public List<Video> videoList() {
        return videoRepository.findAll();
    }

    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Creator %s not found", id)));
    }

    @MutationMapping
    public Creator saveCreator(@Argument CreatorRequest creatorRequest) {
        System.out.println("appah");
        System.out.println(creatorRequest);
        System.out.println("Save creator: " + creatorRequest.getName());
        Creator creator = new Creator();
        creator.setName(creatorRequest.getName());
        creator.setEmail(creatorRequest.getEmail());
        return creatorRepository.save(creator);
    }

    @MutationMapping
    public Video saveVideo(@Argument VideoRequest videoRequest) {
        System.out.println("Saving video: test");
        System.out.println(videoRequest);
        Video video = new Video();
        video.setName(videoRequest.getName());
        video.setUrl(videoRequest.getUrl());
        video.setDescription(videoRequest.getDescription());
        video.setDatePublication(videoRequest.getDatePublication());

        Creator creator = creatorRepository.findByName(videoRequest.getCreator().getName());
        video.setCreator(creator);

        return videoRepository.save(video);
    }
}