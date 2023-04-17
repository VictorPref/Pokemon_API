package com.pokemon.api.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class DatabaseConfiguration {
}
