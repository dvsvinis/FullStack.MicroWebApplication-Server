package zipcode.group3.showboat.service;

import zipcode.group3.showboat.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
