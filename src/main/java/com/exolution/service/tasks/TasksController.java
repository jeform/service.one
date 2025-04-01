package com.exolution.service.tasks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    private final TaskRepository taskRepository;

    public TasksController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Add methods to handle HTTP requests (e.g., GET, POST, PUT, DELETE) for tasks
    @PostMapping
    public ResponseEntity<TasksEntity> createTask(@RequestBody TasksEntity tasksEntity) {
        return ResponseEntity.ok(this.taskRepository.save(tasksEntity));
    }

}