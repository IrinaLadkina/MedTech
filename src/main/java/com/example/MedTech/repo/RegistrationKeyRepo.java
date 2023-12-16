package com.example.MedTech.repo;

import com.example.MedTech.domain.RegistrationKey;
import com.example.MedTech.domain.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationKeyRepo extends CrudRepository<RegistrationKey, Long> {
    List<RegistrationKey> findByUsernameAndCreator(String username, String creator);
    List<RegistrationKey> findByCreatorAndRole(String creator, Role role);
    List<RegistrationKey> findByCreatorAndRoleAndUsernameContains(String creator, Role role, String username);
    List<RegistrationKey> findByUsername(String username);
    RegistrationKey findByKey(String key);
}
