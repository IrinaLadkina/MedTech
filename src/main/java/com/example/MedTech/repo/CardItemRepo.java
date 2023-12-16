package com.example.MedTech.repo;

import com.example.MedTech.domain.CardItem;
import org.springframework.data.repository.CrudRepository;

public interface CardItemRepo extends CrudRepository<CardItem, Long> {
}
