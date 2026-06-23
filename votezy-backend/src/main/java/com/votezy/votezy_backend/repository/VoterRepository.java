package com.votezy.votezy_backend.repository;

import com.votezy.votezy_backend.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Long> {
}