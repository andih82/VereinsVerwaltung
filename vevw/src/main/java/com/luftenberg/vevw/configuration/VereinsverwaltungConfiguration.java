package com.luftenberg.vevw.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.luftenberg.vevw.model")
@ComponentScan(basePackages = {"com.luftenberg.vevw.service", "com.luftenberg.vevw.view"})
public class VereinsverwaltungConfiguration {

}
