package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.exception.ApiRequestException;
import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> getAll(){
        try{
            return categoryService.getAll();
        }catch (Exception e){
            throw new ApiRequestException(e.getMessage());
        }
    }

    @PostMapping("/save")
    public void save(@RequestBody Category category){
        try{
            categoryService.save(category);
        }catch (Exception e){
            throw new ApiRequestException("This category already existed!");
        }
    }

    @PutMapping("/update")
    public void update(@RequestBody Category category, @RequestParam String categoryID){
        try{
            categoryService.update(category.getName(), categoryID);
        }catch (Exception e){
            throw new ApiRequestException("Please check category list again!");
        }
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String categoryID){
        categoryService.delete(categoryID);
    }

}
