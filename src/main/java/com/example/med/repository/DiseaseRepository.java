package com.example.med.repository;

import com.example.med.entity.Disease;
import com.example.med.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface DiseaseRepository extends CrudRepository<Disease, Integer> {
}
