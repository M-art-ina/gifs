package pl.martina.gifs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// @AllArgsConstructor - zamiast tworzenia samemu constructora, lombok  moze zrobic to za nas

public class Gif {

    private String name;
    private String username;
    private Boolean favorite;
    private int categoryId;

    public Gif(String name, String username, Boolean favorite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }
}
