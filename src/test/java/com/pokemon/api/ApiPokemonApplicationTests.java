package com.pokemon.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApiPokemonApplicationTests {

	@Test
	void contextLoads() {
		ApiPokemonApplication.main(new String[]{});
		assertTrue(true);
	}

}
