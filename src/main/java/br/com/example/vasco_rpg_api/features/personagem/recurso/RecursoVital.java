package br.com.example.vasco_rpg_api.features.personagem.recurso;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class RecursoVital {

    @Column(nullable = false)
    private Integer atual;

    @Column(nullable = false)
    private Integer maximo;

}
