package com.epicode.projects.Esercizio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ConfigurationBean {

    @Bean
    public Topping mozzarella(){
        return new Topping("Mozzarella", 92, 0.69);
    }

    @Bean
    public Topping pomodoro(){
        return new Topping("Pomodoro", 42, 0.50);
    }

    @Bean
    public Topping prosciutto(){
        return new Topping("Prosciutto", 55, 0.99);
    }

    @Bean
    public Topping cipolle(){
        return new Topping("Cipolle", 22, 0.69);
    }

    @Bean
    public Topping ananas(){
        return new Topping("Ananas", 25, 0.79);
    }

    @Bean
    public Topping salame(){
        return new Topping("Salame", 86, 0.99);
    }

    //-------------------------------------------------------------------------------
    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%)", 607, 7.49);
    }
    //-------------------------------------------------------------------------------

    @Bean
    public Pizza margherita(){
        return new Pizza("Margherita", List.of(pomodoro(), mozzarella()), 1104, 4.99);
    }

    @Bean
    public Pizza hawaiana(){
        return new Pizza("Hawaiana", List.of(pomodoro(), mozzarella(), prosciutto(), ananas()), 1024, 6.49);
    }

    @Bean
    public Pizza salamona(){
        return new Pizza("Salamona", List.of(pomodoro(), mozzarella(), salame()), 1160, 5.99);
    }

    @Bean
    public Menu menu(){
        return new Menu(
                        List.of(margherita(),hawaiana(),salamona()),
                        List.of(mozzarella(),pomodoro(),prosciutto(),salame(),ananas(),cipolle()),
                        List.of(lemonade(),water(),wine())
                       );
    }


}
