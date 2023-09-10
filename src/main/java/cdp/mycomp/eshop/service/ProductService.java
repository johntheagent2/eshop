package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Product;
import cdp.mycomp.eshop.model.User;
import cdp.mycomp.eshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService implements ServiceInterface<Product>{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String getType() {
        return "product";
    }

    @Override
    public void save(Product obj) {
        String productName = obj.getName();
        if(productRepository.existsProductByName(productName)){
            Product product = productRepository.getProductsByName(productName);
            int currentQuantity = product.getQuantity();
            product.setQuantity(currentQuantity + obj.getQuantity());
            productRepository.save(product);
        }
        productRepository.save(obj);
    }

    @Override
    public void update(Product obj, String objID) {
        Optional<Product> productUpdated = productRepository.findById(objID);
        productUpdated.get().setName(obj.getName());
        save(productUpdated.get());
    }

    @Override
    public void delete(String objID) {
        productRepository.deleteById(objID);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findByID(String objID) {
        return productRepository.findById(objID).get();
    }
}
