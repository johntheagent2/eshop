package cdp.mycomp.eshop.controller;

import cdp.mycomp.eshop.exception.ApiRequestException;
import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.model.User;
import cdp.mycomp.eshop.repository.UserRepository;
import cdp.mycomp.eshop.service.CategoryService;
import cdp.mycomp.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getAll(){
        try{
            return userService.getAll();
        }catch (Exception e){
            throw new ApiRequestException(e.getMessage());
        }
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        try{
            userService.save(user);
        }catch (Exception e){
            throw new ApiRequestException("This user already existed!");
        }
    }

    @PutMapping("/update")
    public void update(@RequestBody Category category, @RequestParam String categoryID){
        try{
            userService.update(category.getName(), categoryID);
        }catch (Exception e){
            throw new ApiRequestException("Please check user information again!");
        }
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String userID){
        userService.delete(userID);
    }
}
