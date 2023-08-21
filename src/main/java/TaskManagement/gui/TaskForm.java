package TaskManagement.gui;

import TaskManagement.tasks.boundary.dto.EditedTask;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class TaskForm extends FormLayout {
    private final Binder<EditedTask> binder = new Binder<>(EditedTask.class);
    private final TextField title = new TextField("Title");
    private final TextArea description = new TextArea("Description");
    private final EditedTask task;

    public TaskForm(EditedTask task) {
        this.task = task;
        binder.readBean(task);
        binder.bind(title, EditedTask::getTitle, EditedTask::setTitle);
        binder.bind(description, EditedTask::getDescription, EditedTask::setDescription);
        add(title, description);
    }

    public EditedTask getEditedTask() {
        binder.writeBeanIfValid(task);
        return task;
    }
}