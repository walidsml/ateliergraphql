package org.example.ateliergraphql.service;

import lombok.AllArgsConstructor;
import org.example.ateliergraphql.dao.repository.VideoRepository;
import org.example.ateliergraphql.dto.VideoDto;
import org.example.ateliergraphql.mapper.CreatorMapper;
import org.example.ateliergraphql.mapper.VideoMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VideoManager implements VideoService {

    private VideoRepository videoRepository;
    private VideoMapper mapper;



    @Override
    public VideoDto getVideoById(Long id) {
        return mapper.fromVideoToVideoDto(videoRepository.findById(id).get());
    }
}
