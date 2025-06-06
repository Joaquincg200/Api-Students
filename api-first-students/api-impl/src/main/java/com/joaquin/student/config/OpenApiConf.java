package com.joaquin.student.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConf {
    @Bean
    OpenAPI myOpenAPI() {

        // Se define informacion general del proyecto

        Info info = new Info().title("My Backend API").version("1.0").description("This API exposes endpoints.")
                .termsOfService("https://www.ayuda.com/terms")
                .license(new License().name("MIT License").url("https://choosealicense.com/licenses/mit/"))
                .contact(new Contact().email("joaquin@gmail.com").name("Joaquin").url("https://www.twitch.com"));

        return new OpenAPI().info(info)
                .externalDocs(new ExternalDocumentation().description("Repositorio y Documentación del Proyecto y API")
                        .url("https://github.com/joaquincg200"));
    }
}
