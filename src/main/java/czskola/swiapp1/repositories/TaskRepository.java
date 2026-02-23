package czskola.swiapp1.repositories;

import czskola.swiapp1.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    // Najde všechny úkoly patřící konkrétnímu uživateli podle jeho ID
    List<Task> findByUserId(String userId);

    List<Task> findByIsCompleted(Boolean isCompleted);
}