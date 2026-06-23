package com.votezy.votezy_backend.controller;

import com.votezy.votezy_backend.dto.CandidateVoteResponse;
import com.votezy.votezy_backend.dto.VoteDistributionResponse;
import com.votezy.votezy_backend.entity.Candidate;
import com.votezy.votezy_backend.repository.CandidateRepository;
import com.votezy.votezy_backend.repository.VoteRepository;
import com.votezy.votezy_backend.dto.WinnerResponse;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    private final CandidateRepository candidateRepository;
    private final VoteRepository voteRepository;

    public DashboardController(
            CandidateRepository candidateRepository,
            VoteRepository voteRepository) {

        this.candidateRepository = candidateRepository;
        this.voteRepository = voteRepository;
    }

    @GetMapping("/vote-distribution")
    public List<VoteDistributionResponse> getVoteDistribution() {

        List<VoteDistributionResponse> response =
                new ArrayList<>();

        List<Candidate> candidates =
                candidateRepository.findAll();

        for (Candidate candidate : candidates) {

            Long votes =
                    voteRepository.countByCandidateId(
                            candidate.getId());

            response.add(
                    new VoteDistributionResponse(
                            candidate.getName(),
                            votes
                    )
            );
        }

        return response;
    }

    @GetMapping("/winner")
public WinnerResponse getWinner() {

    List<Candidate> candidates =
            candidateRepository.findAll();

    String winnerName = "";
    String winnerParty = "";
    long maxVotes = 0;

    for (Candidate candidate : candidates) {

        long votes =
                voteRepository.countByCandidateId(
                        candidate.getId());

        if (votes > maxVotes) {

            maxVotes = votes;

            winnerName =
                    candidate.getName();

            winnerParty =
                    candidate.getParty();
        }
    }

    return new WinnerResponse(
            winnerName,
            winnerParty,
            maxVotes
    );
}

@GetMapping("/candidates")
public List<CandidateVoteResponse> getCandidates() {

    List<CandidateVoteResponse> response =
            new ArrayList<>();

    List<Candidate> candidates =
            candidateRepository.findAll();

    for (Candidate candidate : candidates) {

        Long votes =
                voteRepository.countByCandidateId(
                        candidate.getId());

        response.add(
                new CandidateVoteResponse(
                        candidate.getName(),
                        candidate.getParty(),
                        votes
                )
        );
    }

    return response;
}

}