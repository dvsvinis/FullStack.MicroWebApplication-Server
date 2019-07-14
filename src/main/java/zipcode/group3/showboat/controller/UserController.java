package zipcode.group3.showboat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.User;
import zipcode.group3.showboat.repository.UserRepository;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * returns a list of Users
     * @return
     */
    @GetMapping("/users")
    public List<User> list() {
        return userRepository.findAll();
    }

    /**
     * return a specific video
     * @param id - the primary key of the user as a path
     * @return a user matching that id
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

    /**
     * Creates a new video from a json object
     * @param user - a user created from a json object in the Body of the request
     */
    @PostMapping("user")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }
}