package com.epicode.projects.Esercizio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ConfigurationBean {
    @Bean
    @Scope("prototype")
    public Pizza pizza1(String nome, List<Topping> toppings){

        return new Pizza();
    }

}
