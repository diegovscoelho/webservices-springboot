package com.diegoprojects.javacourse.repositories;

import com.diegoprojects.javacourse.entities.Order;
import com.diegoprojects.javacourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
