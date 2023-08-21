package TaskManagement.tasks.boundary.dto;

import TaskManagement.tasks.entity.Task;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ViewedTask {
    private final Long id;
    private final String title;
    private final String description;
    private final LocalDateTime createdAt;

    public ViewedTask(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.createdAt = task.getCreatedAt();
    }
}
