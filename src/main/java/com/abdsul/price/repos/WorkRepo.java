package com.abdsul.price.repos;

import com.abdsul.price.model.Category;
import com.abdsul.price.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepo extends JpaRepository<Work, Long> {
    List<Work> findByCategory(Category category);
}
