package br.com.example.vasco_rpg_api.features.personagem.character.model.entity;

import br.com.example.vasco_rpg_api.features.personagem.atributes.Atributes;
import br.com.example.vasco_rpg_api.features.personagem.identity.Classe;
import br.com.example.vasco_rpg_api.features.personagem.identity.Origem;
import br.com.example.vasco_rpg_api.features.personagem.identity.Trilha;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Embedded
    private Atributes atributes;

    @Enumerated(EnumType.STRING)
    private Origem origem;

    @Enumerated(EnumType.STRING)
    private Classe classe;

    @Enumerated(EnumType.STRING)
    private Trilha trilha;

}
