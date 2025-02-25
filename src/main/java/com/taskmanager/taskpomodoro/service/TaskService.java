package com.taskmanager.taskpomodoro.service;

import com.taskmanager.taskpomodoro.model.Task;
import com.taskmanager.taskpomodoro.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    public Task updateTask(String id, Task updateTask) {
        if(taskRepository.existsById(id)) {
            updateTask.setId(id);
            return taskRepository.save(updateTask);
        }
        return null; // Tratar erro corretamente
    }
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}
