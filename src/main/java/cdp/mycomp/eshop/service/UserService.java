package cdp.mycomp.eshop.service;

import cdp.mycomp.eshop.model.Category;
import cdp.mycomp.eshop.model.User;
import cdp.mycomp.eshop.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public void update(String userName, String userID){
        Optional<User> user = userRepository.findById(userID);
        user.get().setName(userName);
        save(user.get());
    }

    public void delete(String userID){
        userRepository.deleteById(userID);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User findCategoryByID(String userID){
        return userRepository.findById(userID).get();
    }
}
