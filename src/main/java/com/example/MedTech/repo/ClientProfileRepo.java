package com.example.MedTech.repo;

import com.example.MedTech.domain.ClientProfile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientProfileRepo  extends CrudRepository<ClientProfile, Long> {
    ClientProfile findByAccount_Id(Long accountId);
    List<ClientProfile> findByAccount_UsernameContainsOrCredentialsContainsOrTelephoneContains(String username,
                                                                                                 String credentials,
                                                                                                 String telephone);
}
