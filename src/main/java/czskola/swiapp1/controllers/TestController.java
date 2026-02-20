package czskola.swiapp1.controllers;

import czskola.swiapp1.entities.User;
import czskola.swiapp1.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String test() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password123");
        user.setAge(25);
        user.setEmail("test@example.com");
        user.setFirstName("John");
        user.setLastName("Doe");

        userRepository.save(user);

        return "Hello from Test Controller";

//test
    }
}


