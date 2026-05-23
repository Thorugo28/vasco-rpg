package br.com.example.vasco_rpg_api.features.personagem.recurso.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecursoVitalOutputDTO {

    private Integer atual;
    private Integer maximo;
}
