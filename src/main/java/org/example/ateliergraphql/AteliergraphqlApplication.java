package org.example.ateliergraphql;

import org.example.ateliergraphql.dao.entity.Creator;
import org.example.ateliergraphql.dao.entity.Video;
import org.example.ateliergraphql.dao.repository.CreatorRepository;
import org.example.ateliergraphql.dao.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AteliergraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(AteliergraphqlApplication.class, args);
    }


    @Bean
    CommandLineRunner start(VideoRepository videoRepository, CreatorRepository creatorRepository) {
        return args -> {
            // Create or retrieve a Creator
            Creator creator1 = creatorRepository.save(Creator.builder().name("Walid").email("walid@gmail.com").build());
            Creator creator2 = creatorRepository.save(Creator.builder().name("Sarah").email("sarah@gmail.com").build());

            // Create a list of Video entities with the specified creators
            List<Video> videos = List.of(
                    Video.builder()
                            .name("video 1")
                            .url("https://example.com/video1")
                            .description("Description of video 1")
                            .datePublication(new Date())
                            .creator(creator1)
                            .build(),

                    Video.builder()
                            .name("video 2")
                            .url("https://example.com/video2")
                            .description("Description of video 2")
                            .datePublication(new Date())
                            .creator(creator2)
                            .build()
            );

            // Save all videos to the VideoRepository
            videoRepository.saveAll(videos);
        };
    }



}

