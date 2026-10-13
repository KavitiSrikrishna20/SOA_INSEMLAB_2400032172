package com.example.catalog_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.cloud.service-registry.auto-registration.enabled=false"
})
class CatalogServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
