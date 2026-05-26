package br.com.example.vasco_rpg_api.features.personagem.character.controller;

import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.input.CharacterInputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.output.CharacterOutputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.service.CharacterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController implements CharacterControllerOpenApi {

    private final CharacterService characterService;

    @PostMapping
    @Override
    public ResponseEntity<CharacterOutputDTO> create(@Valid @RequestBody CharacterInputDTO characterInputDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(characterService.create(characterInputDTO));
    }
}