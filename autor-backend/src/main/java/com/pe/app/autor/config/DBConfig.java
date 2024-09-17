package com.pe.app.autor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class DBConfig extends AbstractR2dbcConfiguration{

	@Value("${spring.r2dbc.url}")
	private String dbURL;
	
	@Override
	public ConnectionFactory connectionFactory() {
		// TODO Auto-generated method stub
		return ConnectionFactories.get(dbURL);
	}

	@Bean
	public ConnectionFactoryInitializer inicializar(ConnectionFactory connectionFactory) {
		ConnectionFactoryInitializer initialize = new ConnectionFactoryInitializer();
		initialize.setConnectionFactory(connectionFactory);
		CompositeDatabasePopulator populator = new CompositeDatabasePopulator();
		populator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
		initialize.setDatabasePopulator(populator);
		return initialize;
	}
}
