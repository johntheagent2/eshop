package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
}
