package org.example.ateliergraphql.dto;

import jakarta.persistence.*;
import lombok.*;
import org.example.ateliergraphql.dao.entity.Video;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatorDto {

        private String name;
        private String email;

//        @OneToMany(mappedBy = "creator")
//        private List<Video> videos;
}

