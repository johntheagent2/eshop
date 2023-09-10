package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.model.User;
import cdp.mycomp.eshop.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class UserService implements ServiceInterface<User>{
    @Autowired
    private UserRepository userRepository;

    public String getType(){
        return "user";
    }
    public void save(User user){
        userRepository.save(user);
    }
    public void update(User user, String objID){
        Optional<User> userUpdated = userRepository.findById(objID);
        userUpdated.get().setName(user.getName());
        save(userUpdated.get());
    }
    public void delete(String userID){
        userRepository.deleteById(userID);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User findByID(String userID){
        return userRepository.findById(userID).get();
    }
}
