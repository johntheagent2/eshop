package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService {
    private ProductRepository productRepository;
}
