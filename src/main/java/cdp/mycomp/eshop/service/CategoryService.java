package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService  implements ServiceInterface<Category> {
    @Autowired
    private CategoryRepository categoryRepository;

    public String getType(){return "category";}

    public void save(Category category){
        categoryRepository.save(category);
    }

    public void update(Category category, String categoryID){
        Optional<Category> categoryUpdate = categoryRepository.findById(categoryID);
        categoryUpdate.get().setName(category.getName());
        save(categoryUpdate.get());
    }

    public void delete(String categoryID){
        categoryRepository.deleteById(categoryID);
    }

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Category findByID(String categoryID){
        return categoryRepository.findById(categoryID).get();
    }
}
