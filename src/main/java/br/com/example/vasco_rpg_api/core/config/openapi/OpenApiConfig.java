package br.com.example.vasco_rpg_api.core.config.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${maven.name}")
    public String name;

    @Value("${maven.description}")
    public String description;

    @Value("${maven.version}")
    public String version;

    @Bean
    OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title(name)
                        .version(version)
                        .description(description)
                        .termsOfService("http://swagger.io/terms")
                        .license(new License().name("Apache 2.0")));
    }

}
