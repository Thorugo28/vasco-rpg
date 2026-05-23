package br.com.example.vasco_rpg_api.features.personagem.character.mapper;

import br.com.example.vasco_rpg_api.core.mapper.BaseMapper;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.input.CharacterInputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.output.CharacterOutputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.entity.Character;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CharacterMapper extends BaseMapper<CharacterInputDTO, Character, CharacterOutputDTO> {

    @Override
    @Mapping(target = "defesaTotal", expression = "java(entity.getDefesaTotal())")
    CharacterOutputDTO toDTO(Character entity);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pontosDeVida.maximo", source = "pontosDeVidaMaximo")
    @Mapping(target = "pontosDeVida.atual", source = "pontosDeVidaMaximo")
    @Mapping(target = "sanidade.maximo", source = "sanidadeMaximo")
    @Mapping(target = "sanidade.atual", source = "sanidadeMaximo")
    @Mapping(target = "pontosDeEsforco.maximo", source = "pontosDeEsforcoMaximo")
    @Mapping(target = "pontosDeEsforco.atual", source = "pontosDeEsforcoMaximo")
    @Mapping(target = "defesa.bonus", source = "defesaBonus")
    Character toEntity(CharacterInputDTO entrada);

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pontosDeVida.maximo", source = "pontosDeVidaMaximo")
    @Mapping(target = "pontosDeVida.atual", ignore = true)
    @Mapping(target = "sanidade.maximo", source = "sanidadeMaximo")
    @Mapping(target = "sanidade.atual", ignore = true)
    @Mapping(target = "pontosDeEsforco.maximo", source = "pontosDeEsforcoMaximo")
    @Mapping(target = "pontosDeEsforco.atual", ignore = true)
    @Mapping(target = "defesa.bonus", source = "defesaBonus")
    void copyToEntity(CharacterInputDTO entrada, @MappingTarget Character entity);
}
