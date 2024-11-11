package org.example.ateliergraphql.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class VideoRequest {
    private String name;
    private String url;
    private String description;
    private String datePublication;
    private CreatorRequest creator;
}
