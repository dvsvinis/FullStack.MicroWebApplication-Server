package zipcode.group3.showboat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.User;
import zipcode.group3.showboat.repository.UserRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * returns a list of Users
     * @return
     */
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    /**
     * return a specific video
     * @param id - the primary key of the user as a path
     * @return a user matching that id
     */
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

    /**
     * Creates a new video from a json object
     * @param user - a user created from a json object in the Body of the request
     */
    @PutMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}