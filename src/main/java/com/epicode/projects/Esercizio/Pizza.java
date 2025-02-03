package com.epicode.projects.Esercizio;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Pizza extends Alimento{
    private String name;
    private List<Topping> toppings;

    public Pizza(String name, List<Topping> toppings, int calorie, double prezzo) {
        super(calorie, prezzo);
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                "} " + super.toString();
    }
}
