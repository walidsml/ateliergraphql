package org.example.ateliergraphql.dao.repository;

import org.example.ateliergraphql.dao.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
