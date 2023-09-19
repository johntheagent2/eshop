package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Product;
import cdp.mycomp.eshop.model.Receipt;
import cdp.mycomp.eshop.model.ReceiptDetails;
import cdp.mycomp.eshop.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReceiptService implements ServiceInterface<Receipt> {
    private ReceiptRepository receiptRepository;

    @Override
    public String getType() {
        return "receipt";
    }

    @Override
    public void save(Receipt obj) {
        List<ReceiptDetails> productsDetails = obj.getReceiptDetails();
        int totalPrice = 0;

        for(ReceiptDetails product : productsDetails){
            totalPrice = totalPrice + product.getPrice();
        }

        obj.setTotalPrice(totalPrice);
        receiptRepository.save(obj);
    }

    @Override
    public void update(Receipt obj, String objID) {

    }

    @Override
    public void delete(String objID) {
        receiptRepository.deleteById(objID);
    }

    @Override
    public List<Receipt> getAll() {
        return receiptRepository.findAll();
    }

    @Override
    public Receipt findByID(String objID) {
        return receiptRepository.findById(objID).get();
    }
}
