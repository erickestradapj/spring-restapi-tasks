package com.spring.tasks.app.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tasks", schema = "db_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;
}
