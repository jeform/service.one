package com.exolution.service.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskNotificationSchedule {

    private final TaskService taskService;

    public TaskNotificationSchedule(TaskService taskService) {
        this.taskService = taskService;
    }

    @Scheduled(fixedRate = 3600000 * 24) // 1 hour
    public void checkAndNotifyTasks(){
        this.taskService.sendNotificationForDueTasks();
    }
}
