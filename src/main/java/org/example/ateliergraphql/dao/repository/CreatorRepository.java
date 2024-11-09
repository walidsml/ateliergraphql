package org.example.ateliergraphql.dao.repository;

import org.example.ateliergraphql.dao.entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
}
