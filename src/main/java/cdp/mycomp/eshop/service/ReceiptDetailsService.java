package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.repository.ReceiptDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReceiptDetailsService {
    private ReceiptDetailsRepository receiptDetailsRepository;
}
