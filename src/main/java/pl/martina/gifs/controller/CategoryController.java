package pl.martina.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.martina.gifs.model.Category;
import pl.martina.gifs.repository.CategoryRepository;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String gifCategories(ModelMap modelMap){
        //1. pobieranie wszystkich kategorii
        List<Category> categoryList = categoryRepository.getAllCategories();
        //2. Przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        //3. Wyswietlenie widoku
        return "categories";
    }
}
