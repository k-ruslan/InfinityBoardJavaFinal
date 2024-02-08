package khj.ruslan.InfinityBoardJavaFinal.service;

import khj.ruslan.InfinityBoardJavaFinal.data.TaskRepository;
import khj.ruslan.InfinityBoardJavaFinal.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
