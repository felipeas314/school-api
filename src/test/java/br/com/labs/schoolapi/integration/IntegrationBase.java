package br.com.labs.schoolapi.integration;

import org.testcontainers.containers.PostgreSQLContainer;

public abstract class IntegrationBase {

    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            "postgres:16-alpine"
    );
}
