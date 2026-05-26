package br.com.example.vasco_rpg_api.features.personagem.character.controller;

import br.com.example.vasco_rpg_api.core.handler.Error;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.input.CharacterInputDTO;
import br.com.example.vasco_rpg_api.features.personagem.character.model.dto.output.CharacterOutputDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Characters", description = "Gerenciamento de personagens")
public interface CharacterControllerOpenApi {

    @Operation(summary = "Cria um novo personagem")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Personagem criado com sucesso",
                    content = @Content(schema = @Schema(implementation = CharacterOutputDTO.class))),
            @ApiResponse(responseCode = "400", description = "Dados inválidos",
                    content = @Content(schema = @Schema(implementation = Error.class)))
    })
    ResponseEntity<CharacterOutputDTO> create(@Valid @RequestBody CharacterInputDTO characterInputDTO);
}