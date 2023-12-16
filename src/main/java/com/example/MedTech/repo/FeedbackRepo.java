package com.example.MedTech.repo;

import com.example.MedTech.domain.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
}
