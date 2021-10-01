package com.example.med.repository;

import com.example.med.entity.Patient;
import com.example.med.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
