package com.exolution.service.tasks;

import java.time.LocalDateTime;
import java.util.List;

public class TaskService {
    private final TaskRepository taskRepository;
    private final NotificationClient notificationClient;

    public TaskService(TaskRepository taskRepository, NotificationClient notificationClient) {
        this.taskRepository = taskRepository;
        this.notificationClient = notificationClient;
    }

    public void sendNotificationForDueTasks(){
        LocalDateTime deadline = LocalDateTime.now().plusDays(1);

        List<TasksEntity> tasks = taskRepository.findTasksDueWithinDeadLine(deadline);

        for(TasksEntity task : tasks){
            NotificationRequest request = new NotificationRequest("Sua tarefa: " + task.getTitle() + " está prestes a vencer", task.getEmail());
            notificationClient.sendNotification(request);
            task.setNotified(true);
        }
    }
}
