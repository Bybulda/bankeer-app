package project.bank.bankeer.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                contact = @Contact(
                        name = "Nikita Smirnov",
                        email = "kakeino@yandex.ru",
                        url = "https://github.com/Bybulda"
                ),
                description = "OpenApi documentation for Bank App",
                title = "Bankeer",
                version = "1.0",
                license = @License(
                        name = "No name licence"
                )
        ),
        servers = {
                @Server(
                        description = "TEST ENV",
                        url = "https://localhost:8080"
                )
        }
)
@io.swagger.v3.oas.annotations.security.SecurityScheme(
        type = SecuritySchemeType.HTTP
)
@Configuration
@io.swagger.v3.oas.annotations.security.SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        description = "JWT auth",
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Сервис - банкир")
                .description("Сервис позволяет проводить операции пользователям банка")
                .version("1.0")).components(new Components().addSecuritySchemes("basic", new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("basic")));
    }
}
