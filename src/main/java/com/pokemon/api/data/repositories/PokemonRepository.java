package com.pokemon.api.data.repositories;

import com.pokemon.api.data.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PokemonRepository extends JpaRepository<Pokemon, Long>, PagingAndSortingRepository<Pokemon, Long> {
}
