package com.example.MedTech.repo;

import com.example.MedTech.domain.TechType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TechTypeRepo extends CrudRepository<TechType, Long> {
    TechType findByNameAndDeleted(String name, boolean isDeleted);
    List<TechType> findByDeleted(boolean isDeleted);
}
