package pl.martina.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.martina.gifs.model.Gif;
import pl.martina.gifs.repository.GifRepository;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    // @ResponseBody - to juz nam nie potrzebne bo mamy plik html
    public String hello(ModelMap modelMap){
        //1. krok pracy z thymeleaf Wyciągnięcie gifów
        List<Gif> gifList = gifRepository.getGifs();
        //2. Przekazanie do view
        modelMap.put("gifs", gifList);
        //3. Zwrocennie widoku
        return "home";
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifNames();
    }


    @GetMapping("/gif/{name}")
    public String getGifByName(@PathVariable String name, ModelMap modelMap){
        //1.Wyciagniecie gifa
        Gif g = gifRepository.getGifByName(name);
        //2.Przekazanie do view
        modelMap.put("gif",g);
        //3.Zwrocenie widoku
        return "gif-details";
    }

}
