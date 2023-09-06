package cdp.mycomp.eshop.repository;

import cdp.mycomp.eshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
