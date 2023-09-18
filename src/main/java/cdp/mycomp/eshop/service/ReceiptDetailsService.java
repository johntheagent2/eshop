package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.ReceiptDetails;
import cdp.mycomp.eshop.repository.ReceiptDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReceiptDetailsService implements ServiceInterface<ReceiptDetails> {
    private ReceiptDetailsRepository receiptDetailsRepository;

    @Override
    public String getType() {
        return "Receipt Details";
    }

    @Override
    public void save(ReceiptDetails obj) {
        int quantity = obj.getQuantity();
        int productPrice = obj.getProduct().getPrice();

        int totalPrice = quantity * productPrice;

        obj.setPrice(totalPrice);
        receiptDetailsRepository.save(obj);
    }

    @Override
    public void update(ReceiptDetails obj, String objID) {

    }

    @Override
    public void delete(String objID) {
        receiptDetailsRepository.deleteById(objID);
    }

    @Override
    public List<ReceiptDetails> getAll() {
        return receiptDetailsRepository.findAll();
    }

    @Override
    public ReceiptDetails findByID(String objID) {
        return receiptDetailsRepository.findById(objID).get();
    }
}
