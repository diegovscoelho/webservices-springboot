package com.diegoprojects.javacourse.repositories;

import com.diegoprojects.javacourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
