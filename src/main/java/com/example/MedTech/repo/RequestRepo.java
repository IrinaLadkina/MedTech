package com.example.MedTech.repo;

import com.example.MedTech.domain.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RequestRepo extends CrudRepository<Request, Long> {
    List<Request> findByClientProfile_Account_Id(Long id);
}
