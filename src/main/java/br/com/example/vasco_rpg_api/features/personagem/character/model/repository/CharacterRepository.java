package br.com.example.vasco_rpg_api.features.personagem.character.model.repository;

import br.com.example.vasco_rpg_api.features.personagem.character.model.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
