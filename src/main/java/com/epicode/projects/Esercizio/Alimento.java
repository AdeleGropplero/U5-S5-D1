package com.epicode.projects.Esercizio;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Alimento {
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return "Alimento: \n" +
                "calorie=" + calorie + "kCal \n" +
                ", prezzo=" + prezzo + "€ \n"
                ;
    }
}
