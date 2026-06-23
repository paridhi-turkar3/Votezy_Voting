package com.votezy.votezy_backend.repository;

import com.votezy.votezy_backend.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}