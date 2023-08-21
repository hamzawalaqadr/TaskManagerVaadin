package TaskManagement.tasks.boundary;

import TaskManagement.tasks.entity.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task getById(Long id);
    void create(Task task);
    void deleteById(Long id);
    void update(Long id, String title, String description);
}