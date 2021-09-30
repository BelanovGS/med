package com.example.med.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.med.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
