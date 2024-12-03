package org.example.ateliergraphql.service;

import lombok.AllArgsConstructor;
import org.example.ateliergraphql.dao.repository.CreatorRepository;
import org.example.ateliergraphql.dto.CreatorDto;
import org.example.ateliergraphql.dto.CreatorDtoInscription;
import org.example.ateliergraphql.mapper.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatorManager implements CreatorService {

    private CreatorRepository creatorRepository;
    private CreatorMapper mapper;


    @Override
    public CreatorDto getCreatorById(Long id) {
        return mapper.fromCreatorToCreatorDto(creatorRepository.findById(id).get());
    }

    @Override
    public CreatorDto addCreator(CreatorDtoInscription creatorDtoInscription) {
        return mapper.fromCreatorToCreatorDto(creatorRepository.save(mapper.fromCreatorDtoInscriptiontoCreator(creatorDtoInscription)));
    }
}
