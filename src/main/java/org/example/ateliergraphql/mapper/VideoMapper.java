package org.example.ateliergraphql.mapper;

import org.example.ateliergraphql.dao.entity.Video;
import org.example.ateliergraphql.dto.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {
    ModelMapper mapper = new ModelMapper();

    public VideoDto fromVideoToVideoDto(Video video) {
        return mapper.map(video, VideoDto.class);
    }
    public Video fromVideoDtoToVideo(VideoDto videoDto) {
        return mapper.map(videoDto, Video.class);
    }

}
