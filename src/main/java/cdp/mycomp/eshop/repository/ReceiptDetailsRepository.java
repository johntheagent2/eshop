package cdp.mycomp.eshop.repository;

import cdp.mycomp.eshop.model.ReceiptDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptDetailsRepository extends JpaRepository<ReceiptDetails, Integer> {
}
