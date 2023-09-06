package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReceiptService {
    private ReceiptRepository receiptRepository;
}
