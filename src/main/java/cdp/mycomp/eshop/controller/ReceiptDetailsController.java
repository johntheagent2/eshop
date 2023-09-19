package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.model.ReceiptDetails;
import cdp.mycomp.eshop.service.ReceiptDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receipt_details")
public class ReceiptDetailsController {
    @Autowired
    ReceiptDetailsService receiptDetailsService;

    @PostMapping("/save")
    public void save(@RequestBody ReceiptDetails receiptDetails){
        receiptDetailsService.save(receiptDetails);
    }

    @GetMapping
    public List<ReceiptDetails> getAll(){
        return receiptDetailsService.getAll();
    }
}
