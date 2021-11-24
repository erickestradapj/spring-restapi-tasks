package com.spring.tasks.app.repository;

import com.spring.tasks.app.models.Task;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "tasks", collectionResourceRel = "tasks")
@CrossOrigin
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
