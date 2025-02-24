package com.taskmanager.taskpomodoro.repository;

import com.taskmanager.taskpomodoro.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
    //Se necessario adicionar metodos personalizados.
}
