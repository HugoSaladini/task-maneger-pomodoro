package com.taskmanager.taskpomodoro.model;

import lombok.Data;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collation = "tasks") // Define que essa classe ser[a uma coleção mongoDB
public class Task {

    @Id
    private String id;

    private String title;
    private String description;
    private boolean completed;
    private int duration;
    private LocalDateTime createdAt = LocalDateTime.now();

}
