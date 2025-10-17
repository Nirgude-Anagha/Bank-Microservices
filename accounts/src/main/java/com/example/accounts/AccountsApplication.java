package com.example.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts API Rest API documentation",
                description = "Accounts microservice API Rest API documentation",
                version = "V1",
                contact = @Contact(
                        name = "Anagha Nirgude",
                        email = "anagha@gmail.com",
                        url = "accounts.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "accounts.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Accounts microservice API Rest API documentation",
                url = "accounts.com"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
