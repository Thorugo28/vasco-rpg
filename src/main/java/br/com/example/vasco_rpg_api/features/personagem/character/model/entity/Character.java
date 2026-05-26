package br.com.example.vasco_rpg_api.features.personagem.character.model.entity;

import br.com.example.vasco_rpg_api.features.personagem.atributes.Atributes;
import br.com.example.vasco_rpg_api.features.personagem.recurso.Defesa;
import br.com.example.vasco_rpg_api.features.personagem.recurso.RecursoVital;
import br.com.example.vasco_rpg_api.features.personagem.identity.Classe;
import br.com.example.vasco_rpg_api.features.personagem.identity.Origem;
import br.com.example.vasco_rpg_api.features.personagem.identity.Trilha;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Pericias;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Treinamento;
import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

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
    @Column(nullable = false)
    private Origem origem;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Classe classe;

    @Enumerated(EnumType.STRING)
    private Trilha trilha;

    @ElementCollection
    @CollectionTable(name = "personagem_pericias")
    @MapKeyEnumerated(EnumType.STRING)
    @Enumerated(EnumType.STRING)
    private Map<Pericias, Treinamento> pericias;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "atual", column = @Column(name = "hp_atual")),
            @AttributeOverride(name = "maximo", column = @Column(name = "hp_maximo"))
    })
    private RecursoVital pontosDeVida;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "atual", column = @Column(name = "sanidade_atual")),
            @AttributeOverride(name = "maximo", column = @Column(name = "sanidade_maximo"))
    })
    private RecursoVital sanidade;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "atual", column = @Column(name = "pe_atual")),
            @AttributeOverride(name = "maximo", column = @Column(name = "pe_maximo"))
    })
    private RecursoVital pontosDeEsforco;

    @Embedded
    private Defesa defesa;

    @Column(nullable = false)
    private Integer nex;

    public Integer getDefesaTotal() {
        return defesa.calcular(atributes.getAgilidade());
    }

}
