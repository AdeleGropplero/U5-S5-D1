package com.epicode.projects.Esercizio;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alimento {
    private int calorie;
    private double prezzo;

    public Alimento(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    // Getter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Alimento: \n" +
                "calorie=" + calorie + "kCal \n" +
                ", prezzo=" + prezzo + "€ \n"
                ;
    }
}
