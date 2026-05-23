package br.com.example.vasco_rpg_api.features.personagem.character.model.dto.input;

import br.com.example.vasco_rpg_api.features.personagem.atributes.dto.AtrubutesInputDTO;
import br.com.example.vasco_rpg_api.features.personagem.identity.Classe;
import br.com.example.vasco_rpg_api.features.personagem.identity.Origem;
import br.com.example.vasco_rpg_api.features.personagem.identity.Trilha;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Pericias;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Treinamento;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterInputDTO {

    @NotBlank
    private String name;

    @NotNull
    @Valid
    private AtrubutesInputDTO atributes;

    @NotNull
    private Origem origem;

    @NotNull
    private Classe classe;

    private Trilha trilha;

    @NotNull
    private Map<Pericias, Treinamento> pericias;

    @NotNull
    @Positive
    private Integer pontosDeVidaMaximo;

    @NotNull
    @Positive
    private Integer sanidadeMaximo;

    @NotNull
    @Positive
    private Integer pontosDeEsforcoMaximo;

    @NotNull
    @Min(0)
    private Integer defesaBonus;

    @NotNull
    @Min(0) @Max(95)
    private Integer nex;

}
