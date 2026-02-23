package czskola.swiapp1.controllers;

import czskola.swiapp1.entities.Task;
import czskola.swiapp1.entities.User;
import czskola.swiapp1.repositories.TaskRepository;
import czskola.swiapp1.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks/test")
public class TaskTestController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String testTaskRelation() {
        // 1. Vytvoříme a uložíme nového uživatele
        User user = new User();
        user.setUsername("taskmaster_" + System.currentTimeMillis()); // Unikátní username
        user.setPassword("securepass");
        user.setEmail("taskmaster@example.com");
        userRepository.save(user);

        // 2. Vytvoříme první úkol a přiřadíme ho uživateli
        Task task1 = new Task();
        task1.setTitle("Learn Spring Boot");
        task1.setDescription("Understand One-to-Many relationships.");
        task1.setUser(user); // Tady se vytváří ta vazba!
        taskRepository.save(task1);

        // 3. Vytvoříme druhý úkol pro stejného uživatele
        Task task2 = new Task();
        task2.setTitle("Write Code");
        task2.setDescription("Create entities, repositories and controllers.");
        task2.setIsCompleted(true);
        task2.setUser(user);
        taskRepository.save(task2);

        return "Successfully created 1 User and linked 2 Tasks to them!";
    }
}