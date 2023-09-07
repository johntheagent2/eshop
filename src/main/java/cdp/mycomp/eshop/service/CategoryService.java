package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void save(Category category){
        categoryRepository.save(category);
    }

    public void update(String categoryName, String categoryID){
        Optional<Category> category = categoryRepository.findById(categoryID);
        category.get().setName(categoryName);
        save(category.get());
    }

    public void delete(String categoryID){
        categoryRepository.deleteById(categoryID);
    }

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Category findCategoryByID(String categoryID){
        return categoryRepository.findById(categoryID).get();
    }
}
