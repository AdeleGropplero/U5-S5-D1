package com.epicode.projects.Esercizio;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Drink extends Alimento {
    private String bevanda;

    @Override
    public String toString() {
        return "Drink{" +
                "bevanda='" + bevanda + '\'' +
                "} " + super.toString();
    }
}
