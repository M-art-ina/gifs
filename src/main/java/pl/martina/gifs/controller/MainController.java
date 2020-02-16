package pl.martina.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.martina.gifs.model.Gif;
import pl.martina.gifs.repository.GifRepository;

@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "dziala";
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifNames();
    }


}
