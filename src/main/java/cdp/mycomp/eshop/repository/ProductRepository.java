package cdp.mycomp.eshop.repository;

import cdp.mycomp.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    boolean existsProductByName(String name);
    Product getProductsByName(String name);
}
