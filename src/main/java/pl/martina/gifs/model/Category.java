package pl.martina.gifs.model;

import lombok.Getter;
import lombok.Setter;
 // lub @Getter
 //    @Setter mogą być tutaj i wtedy będą do wszystkich zmiennych
public class Category {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

     public Category(int id, String name) {
         this.id = id;
         this.name = name;
     }
 }
