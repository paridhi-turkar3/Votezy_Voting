package com.votezy.votezy_backend.controller;

import com.votezy.votezy_backend.entity.Vote;
import com.votezy.votezy_backend.repository.VoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/votes")
@CrossOrigin(origins = "*")
public class VoteController {

    private final VoteRepository voteRepository;

    public VoteController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    @PostMapping("/cast")
    public Map<String,String> castVote(@RequestBody Vote vote) {

        if(voteRepository.existsByVoterId(vote.getVoterId())) {

            Map<String,String> error = new HashMap<>();
            error.put("messageString",
                    "Voter has already cast a vote");

            throw new RuntimeException(
                    error.get("messageString"));
        }

        voteRepository.save(vote);

        Map<String,String> response = new HashMap<>();
        response.put("message",
                "Vote cast successfully");

        return response;
    }

    @GetMapping("/count")
    public Long getCount() {
    return voteRepository.count();
    }
}