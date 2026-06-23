package com.votezy.votezy_backend.controller;

import com.votezy.votezy_backend.dto.ElectionResultResponse;
import com.votezy.votezy_backend.entity.Candidate;
import com.votezy.votezy_backend.repository.CandidateRepository;
import com.votezy.votezy_backend.repository.VoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/election-results")
@CrossOrigin(origins = "*")
public class ElectionResultController {

    private final CandidateRepository candidateRepository;
    private final VoteRepository voteRepository;

    public ElectionResultController(
            CandidateRepository candidateRepository,
            VoteRepository voteRepository) {

        this.candidateRepository = candidateRepository;
        this.voteRepository = voteRepository;
    }

    @PostMapping("/declare")
    public ElectionResultResponse declareWinner(
            @RequestBody ElectionResultResponse request) {

        List<Candidate> candidates =
                candidateRepository.findAll();

        Long winnerId = null;
        Long winnerVotes = 0L;

        for (Candidate candidate : candidates) {

            long votes =
                    voteRepository.countByCandidateId(
                            candidate.getId());

            if (votes > winnerVotes) {
                winnerVotes = votes;
                winnerId = candidate.getId();
            }
        }

       ElectionResultResponse response =
        new ElectionResultResponse();

response.setElectionName(
        request.getElectionName());

response.setWinnerId(winnerId);

Candidate winnerCandidate =
        candidateRepository.findById(winnerId)
                .orElseThrow();

response.setWinnerName(
        winnerCandidate.getName());

response.setWinnerParty(
        winnerCandidate.getParty());

response.setWinnerVotes(winnerVotes);

response.setTotalVotes(
        (long) voteRepository.count());

return response;
    }
}