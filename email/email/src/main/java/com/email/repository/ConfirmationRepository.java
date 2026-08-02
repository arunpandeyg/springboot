package com.email.repository;

import com.email.domain.Confirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
  Confirmation findByToken(String token);
}
