package com.pokemon.api.migration;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.pokemon.api.data.entities.Pokemon;
import com.pokemon.api.data.repositories.PokemonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileReader;

@Component
@Profile("!test")
@Slf4j
public class PokemonCSVSeeder implements CommandLineRunner {

    @Autowired
    PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) throws Exception {
        // Read CSV file and insert data into database

        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(ResourceUtils.getFile("classpath:csv_data/pokemon.csv"))).withSkipLines(1).build();
            String[] line;
            while ((line = reader.readNext()) != null) {
                Pokemon pokemon = Pokemon.builder().id(Long.valueOf(line[0]))
                        .name(line[1])
                        .type_1(line[2])
                        .type_2(line[3])
                        .total(Integer.parseInt(line[4]))
                        .hp(Integer.parseInt(line[5]))
                        .attack(Integer.parseInt(line[6]))
                        .defense(Integer.parseInt(line[7]))
                        .sp_atk(Integer.parseInt(line[8]))
                        .sp_def(Integer.parseInt(line[9]))
                        .speed(Integer.parseInt(line[10]))
                        .generation(Integer.parseInt(line[11]))
                        .legendary(Boolean.parseBoolean(line[12])).build();

                pokemonRepository.save(pokemon);
            }
        } catch (Exception e) {
            log.error("csv non disponible");
        }

    }
}
