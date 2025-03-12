package com.diegoprojects.javacourse.repositories;

import com.diegoprojects.javacourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
