package com.qualiteapp.backend;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Digitalisation SMQ - API")
                        .description("Documentation des endpoints de gestion des non-conformités, documents qualité et contrôle de conformité.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Adam Belguerch")
                                .email("contact@qualiteapp.com")
                                .url("https://www.qualiteapp.com")
                        )
                );
    }
}
