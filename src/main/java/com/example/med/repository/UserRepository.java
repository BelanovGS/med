package com.example.med.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.med.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

    String getRole();

    User findByEmail(String email);

}
