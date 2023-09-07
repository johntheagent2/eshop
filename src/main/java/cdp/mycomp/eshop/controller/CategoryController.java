package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> getAllCategory(){
        List<Category> categoryList = categoryService.getAll();
        return categoryList.isEmpty() ? null : categoryList;
    }

    @PostMapping("/save")
    public void saveCategory(@RequestBody Category category){
        categoryService.save(category);
    }

}
