package br.com.example.vasco_rpg_api.features.personagem.character.service;

import br.com.example.vasco_rpg_api.core.handler.exception.InvalidAtributeException;
import br.com.example.vasco_rpg_api.features.personagem.character.mapper.CharacterMapper;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.input.CharacterInputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.output.CharacterOutputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.entity.Character;
import br.com.example.vasco_rpg_api.features.personagem.character.model.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    public CharacterOutputDTO create(CharacterInputDTO characterInputDTO){
        validarAtributos(characterInputDTO);
        validarTrilha(characterInputDTO);
        Character character = characterMapper.toEntity(characterInputDTO);
        character = characterRepository.save(character);
        return characterMapper.toDTO(character);
    }


    private void validarAtributos(CharacterInputDTO characterInputDTO){
        if(characterInputDTO.getNex() <= 10){
            int soma = characterInputDTO.getAtributes().getAgilidade() +
                    characterInputDTO.getAtributes().getForca() +
                    characterInputDTO.getAtributes().getIntelecto() +
                    characterInputDTO.getAtributes().getPresenca() +
                    characterInputDTO.getAtributes().getVigor();
            if (soma != 9){
                throw new InvalidAtributeException("A soma dos atributos deve ser igual a 9");
            }
        }
    }

    private void validarTrilha(CharacterInputDTO characterInputDTO){
        if(characterInputDTO.getNex() <= 10 && characterInputDTO.getTrilha() != null){
            throw new IllegalArgumentException("Você deve escolher uma trilha");
        }
        if (characterInputDTO.getNex() > 10 && characterInputDTO.getTrilha() == null) {
            throw new IllegalArgumentException("Personagem com NEX inferior a 10% não pode ter trilha");
        }
    }

}
