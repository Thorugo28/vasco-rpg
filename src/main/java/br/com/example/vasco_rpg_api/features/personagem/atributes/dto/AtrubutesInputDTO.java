package br.com.example.vasco_rpg_api.features.personagem.atributes.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AtrubutesInputDTO {

    @NotNull
    private Integer forca;

    @NotNull
    private Integer agilidade;

    @NotNull
    private Integer intelecto;

    @NotNull
    private Integer vigor;

    @NotNull
    private Integer presenca;
}
