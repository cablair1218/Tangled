package blair.carina.controller;


import blair.carina.model.User;
import blair.carina.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin
public class UserController {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        userRepository.save(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }


}
