package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.exception.ApiRequestException;
import cdp.mycomp.eshop.model.Product;
import cdp.mycomp.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAll(){
        try{
            return productService.getAll();
        }catch (Exception e){
            throw new ApiRequestException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Product getUserInfoWithID(@PathVariable("id") String productID){
        return productService.findByID(productID);
    }

    @PostMapping("/save")
    public void save(@RequestBody Product product){
        try{
            productService.save(product);
        }catch (Exception e){
            throw new ApiRequestException("This user already existed!");
        }
    }

    @PutMapping("/update")
    public void update(@RequestBody Product product, @RequestParam String productID){
        try{
            productService.update(product, productID);
        }catch (Exception e){
            throw new ApiRequestException("Please check user information again!");
        }
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String userID){
        productService.delete(userID);
    }
}
