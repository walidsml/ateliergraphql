package org.example.ateliergraphql.dao.repository;

import org.example.ateliergraphql.dao.entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
    Creator findByName(String name);  // No Optional here

}
