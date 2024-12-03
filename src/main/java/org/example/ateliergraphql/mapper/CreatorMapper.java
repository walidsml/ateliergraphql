package org.example.ateliergraphql.mapper;

import org.example.ateliergraphql.dao.entity.Creator;
import org.example.ateliergraphql.dto.CreatorDto;
import org.example.ateliergraphql.dto.CreatorDtoInscription;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {

    ModelMapper mapper = new ModelMapper();

    public CreatorDto fromCreatorToCreatorDto(Creator creator) {
        return mapper.map(creator, CreatorDto.class);
    }
    public Creator fromCreatorDtoToCreator(CreatorDto creatorDto) {
        return mapper.map(creatorDto, Creator.class);
    }

    public Creator fromCreatorDtoInscriptiontoCreator(CreatorDtoInscription creatorDtoInscription) {
        return mapper.map(creatorDtoInscription, Creator.class);
    }



}
