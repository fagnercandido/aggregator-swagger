package br.aggregator.swagger.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "documentation.swagger")
public class SwaggerServicesConfig {

	@Getter
	@Setter
	private List<SwaggerService> services;

}
