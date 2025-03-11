package com.diegoprojects.javacourse.services;

import com.diegoprojects.javacourse.entities.Order;
import com.diegoprojects.javacourse.entities.User;
import com.diegoprojects.javacourse.repositories.OrderRepository;
import com.diegoprojects.javacourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
