package rmit.intensive.controller;

import org.springframework.web.bind.annotation.*;
import rmit.intensive.model.User;

@RestController
@CrossOrigin(origins = "*")
public class Login {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User user){
        if (user.getUsername().equals("admin") &&
                user.getPassword().equals("admin")){
            return user;
        }
        else{
            return null;
        }
    }
}
