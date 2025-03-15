package com.diegoprojects.javacourse.repositories;

import com.diegoprojects.javacourse.entities.OrderItem;
import com.diegoprojects.javacourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
