package khj.ruslan.InfinityBoardJavaFinal.controller;

import khj.ruslan.InfinityBoardJavaFinal.model.Task;
import khj.ruslan.InfinityBoardJavaFinal.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public List<Task> addTask(@RequestBody Task task) {
        taskService.addTask(task);
        return taskService.getAllTasks();
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<String> deleteTask(@PathVariable Long taskId){
        taskService.deleteTask(taskId);
        return ResponseEntity.ok("Task deleted successfully");
    }
}
