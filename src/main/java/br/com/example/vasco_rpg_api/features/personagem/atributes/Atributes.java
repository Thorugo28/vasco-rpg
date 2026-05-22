package br.com.example.vasco_rpg_api.features.personagem.atributes;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class Atributes implements Serializable {

    private Integer forca;
    private Integer agilidade;
    private Integer intelecto;
    private Integer vigor;
    private Integer presenca;
}
