package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.model.Receipt;
import cdp.mycomp.eshop.model.ReceiptDetails;
import cdp.mycomp.eshop.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receipt")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @PostMapping("/save")
    public void save(@RequestBody Receipt receipt){
        System.out.println(receipt.getUser().getName());
    }

    @GetMapping
    public List<Receipt> getAllReceipt(){
        return receiptService.getAll();
    }
}
