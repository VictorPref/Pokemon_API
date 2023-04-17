package com.pokemon.api.data.repositories;


import com.pokemon.api.data.entities.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({"test"})
@Transactional
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PokemonRepositoryTest {

    @Autowired
    PokemonRepository pokemonRepository;

    private Pokemon pokemon;

    @BeforeEach
    void setUp() {
        pokemon = Pokemon.builder().name("Petal").speed(1).defense(1).attack(1).build();
        pokemon = pokemonRepository.save(pokemon);
    }

    @Test
    void trouver_pokemon_bd() {
        assertEquals(1, pokemonRepository.findAll().size());
    }

    @Test
    void cree_pokemon_bd() {
        assertEquals(1, pokemonRepository.findAll().size());

        pokemon = Pokemon.builder().name("Petal2").speed(1).defense(1).attack(1).build();
        pokemon = pokemonRepository.save(pokemon);

        assertEquals(2, pokemonRepository.findAll().size());
        assertTrue(pokemonRepository.findById(pokemon.getId()).isPresent());
    }

    @Test
    void modifier_pokemon_bd() {
        String nouveauNom = "Test";

        assertEquals(1, pokemonRepository.findAll().size());
        assertNotEquals(nouveauNom, pokemon.getName());

        pokemon.setName(nouveauNom);
        Pokemon nouveauPokemon = pokemonRepository.save(pokemon);

        assertEquals(1, pokemonRepository.findAll().size());
        assertEquals(nouveauPokemon.getName(), pokemon.getName());
    }

    @Test
    void supprimer_pokemon_bd() {
        assertEquals(1, pokemonRepository.findAll().size());

        pokemonRepository.delete(pokemon);

        assertEquals(0, pokemonRepository.findAll().size());
    }

}
