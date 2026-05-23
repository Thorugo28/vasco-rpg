package br.com.example.vasco_rpg_api.features.personagem.atributes;

import jakarta.persistence.Column;
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

    @Column(nullable = false)
    private Integer forca;

    @Column(nullable = false)
    private Integer agilidade;

    @Column(nullable = false)
    private Integer intelecto;

    @Column(nullable = false)
    private Integer vigor;

    @Column(nullable = false)
    private Integer presenca;
}
