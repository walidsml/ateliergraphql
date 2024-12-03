package org.example.ateliergraphql.service;

import org.example.ateliergraphql.dto.CreatorDto;
import org.example.ateliergraphql.dto.CreatorDtoInscription;

public interface CreatorService {

    public CreatorDto getCreatorById(Long id);

    public CreatorDto addCreator(CreatorDtoInscription creatorDtoInscription);
}
