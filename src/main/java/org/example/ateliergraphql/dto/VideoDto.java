package org.example.ateliergraphql.dto;

import jakarta.persistence.*;
import lombok.*;
import org.example.ateliergraphql.dao.entity.Creator;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoDto {

        private String name;
        private String url;
        private String description;
        private String datePublication;

//        @ManyToOne
//        private Creator creator;
}
