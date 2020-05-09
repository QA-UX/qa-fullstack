package com.example.springsystemfeedback.repository;

import com.example.springsystemfeedback.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
