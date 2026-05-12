package com.projeto.semaforos.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
info = @Info(
    title = "API sobre semáforos",
    version = "1.0",
    description = "Projeto semaforo"
)
)
public class Swagger {
}
