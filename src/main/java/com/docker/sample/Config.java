package com.docker.sample;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.docker.sample.resource")
@Configuration
public class Config {


}
