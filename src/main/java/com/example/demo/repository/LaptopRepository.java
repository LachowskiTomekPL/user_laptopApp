package com.example.demo.repository;

import com.example.demo.model.Laptop;
import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Integer> {

    List<Laptop> findAll();

    Optional<Laptop> findById(Integer id);

    List<Laptop> findAllByLaptopName(String name);

    List<Laptop> findAllByUser(User user);
}
