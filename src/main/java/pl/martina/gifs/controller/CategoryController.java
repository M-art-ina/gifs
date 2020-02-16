package pl.martina.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.martina.gifs.model.Category;
import pl.martina.gifs.model.Gif;
import pl.martina.gifs.repository.CategoryRepository;
import pl.martina.gifs.repository.GifRepository;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/categories")
    public String gifCategories(ModelMap modelMap){
        //1. pobieranie wszystkich kategorii
        List<Category> categoryList = categoryRepository.getAllCategories();
        //2. Przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        //3. Wyswietlenie widoku
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String gifsCategory(@PathVariable int id, ModelMap modelMap){
        //1.1. pobranie kategorii po id
        Category category = categoryRepository.getCategoryById(id);
        //1.2. pobranie gifow z id danej kategorii
        List<Gif> gifs = gifRepository.getGifsByCategoryId(id);
        //2. przekazanie do widoku
        modelMap.put("category",category);
        modelMap.put("gifs",gifs);
        //3.Zwracanie widoku
        return "category";
    }
}
