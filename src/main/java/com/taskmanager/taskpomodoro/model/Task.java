package com.taskmanager.taskpomodoro.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "tasks") // Define que essa classe ser[a uma coleção mongoDB
public class Task {

    @Id
    private String id;

    private String title;
    private String description;
    private boolean completed;
    private int duration;
    private LocalDateTime createdAt = LocalDateTime.now();

    public void setId(String id) {
        this.id = id;
    }
}
