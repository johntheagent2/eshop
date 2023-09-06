package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> getAllCategory(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public void saveCategory(@RequestBody Category category){
        categoryService.save(category);
    }

}
