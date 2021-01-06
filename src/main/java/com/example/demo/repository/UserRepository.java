package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@RepositoryRestResource
@Repository
public interface UserRepository extends CrudRepository<User, Integer> { //JpaRepository??

    List<User> findAll();

    Optional<User> findById(Integer id);

    List<User> findAllByFirstName(String firstname);

    //User findByIdAndFirstNameAndLastName(Integer id, String firsName, String lastName);
}
