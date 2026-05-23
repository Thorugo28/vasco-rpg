package br.com.example.vasco_rpg_api.features.personagem.atributes.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AtributesOutputDTO {

    private Integer forca;
    private Integer agilidade;
    private Integer intelecto;
    private Integer vigor;
    private Integer presenca;
}
