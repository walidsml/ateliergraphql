package org.example.ateliergraphql.service;

import org.example.ateliergraphql.dto.VideoDto;

public interface VideoService {
    public VideoDto getVideoById(Long id);
}
