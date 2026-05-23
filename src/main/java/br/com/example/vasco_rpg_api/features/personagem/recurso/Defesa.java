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
public class Defesa {

    @Column(nullable = false)
    private Integer bonus;

    public Integer calcular(Integer agilidade){
        return this.bonus + agilidade;
    }
}
