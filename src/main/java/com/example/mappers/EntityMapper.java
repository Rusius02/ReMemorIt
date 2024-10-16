package com.example.mappers;

import com.example.dtos.input.EntityInputDto;
import com.example.dtos.output.EntityOutputDto;
import com.example.model.Entity;
import org.mapstruct.Mapper;

@Mapper
public interface EntityMapper {
    EntityOutputDto EntityToEntityOutputDto(Entity entity);
    Entity EntityInputDtoToEntity(EntityInputDto entityInputDto);
    EntityOutputDto EntityInputDtoToEntityOutputDto(EntityInputDto entityInputDto);
}
