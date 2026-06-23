package com.votezy.votezy_backend.repository;

import com.votezy.votezy_backend.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    boolean existsByVoterId(Long voterId);

    long countByCandidateId(Long candidateId);
}