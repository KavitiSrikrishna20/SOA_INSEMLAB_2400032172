
package com.example.catalog_service;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CatalogController {

    private final Environment environment;

    public CatalogController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/catalog")
    public Map<String, String> getCatalog() {
        return Map.of(
            "service", "Catalog Service",
            "port", environment.getProperty("server.port", "unknown"),
            "status", "Running"
        );
    }
}
