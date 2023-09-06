package cdp.mycomp.eshop.repository;

import cdp.mycomp.eshop.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
