package com.luftenberg.vevw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EntityScan(basePackages = "com.luftenberg.vevw.model")
@EnableJpaRepositories(basePackages = "com.luftenberg.vevw.repository")
@ComponentScan(basePackages = {"com.luftenberg.vevw.service", "com.luftenberg.vevw.view"})
@ContextConfiguration(classes = VereinsVerwaltungApplication.class)
public class VereinsVerwaltungApplicationTests {

	@Test
	void contextLoads() {
	}

}
