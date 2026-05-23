package br.com.example.vasco_rpg_api.features.personagem.character.model.dto.output;

import br.com.example.vasco_rpg_api.features.personagem.atributes.dto.AtributesOutputDTO;
import br.com.example.vasco_rpg_api.features.personagem.identity.Classe;
import br.com.example.vasco_rpg_api.features.personagem.identity.Origem;
import br.com.example.vasco_rpg_api.features.personagem.identity.Trilha;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Pericias;
import br.com.example.vasco_rpg_api.features.personagem.pericia.Treinamento;
import br.com.example.vasco_rpg_api.features.personagem.recurso.dto.RecursoVitalOutputDTO;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CharacterOutputDTO {

    private Long id;
    private String name;
    private AtributesOutputDTO atributes;
    private Origem origem;
    private Classe classe;
    private Trilha trilha;
    private Map<Pericias, Treinamento> pericias;
    private RecursoVitalOutputDTO pontosDeVida;
    private RecursoVitalOutputDTO sanidade;
    private RecursoVitalOutputDTO pontosDeEsforco;
    private Integer defesaTotal;
    private Integer nex;
}
