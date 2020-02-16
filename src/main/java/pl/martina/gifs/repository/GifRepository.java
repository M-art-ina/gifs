package pl.martina.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.martina.gifs.model.Gif;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("ben-and-mike", "mika", true, 2),
            new Gif("book-dominos", "mem", true, 0),
            new Gif("compiler-bot", "bot", true, 1),
            new Gif("cowboy-coder", "code", true, 1),
            new Gif("infinite-andrew", "andrew", true, 2)
    );

    public List<Gif> getGifs(){
        return ALL_GIFS;
    }
    public String getGifNames(){
        String result = "";
        for (Gif gif : ALL_GIFS){
            result += gif.getName();
        }
        return result;
    }

    public Gif getGifByName(String name){
       for (Gif g: ALL_GIFS){
            if (g.getName().equals(name)){
                return g;
            }
        } return null;
    }

 }
