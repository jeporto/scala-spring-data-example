package br.porto.com.car.app

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.domain.EntityScan

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(Array("br.porto.com.car"))
@EntityScan(Array("br.porto.com.car"))
@ComponentScan(Array("br.porto.com.car"))
class CarConfig