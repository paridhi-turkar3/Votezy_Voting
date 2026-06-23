package com.votezy.votezy_backend.controller;

import com.votezy.votezy_backend.entity.Voter;
import com.votezy.votezy_backend.repository.VoterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voters")
@CrossOrigin(origins = "*")
public class VoterController {

    private final VoterRepository voterRepository;

    public VoterController(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }

    @GetMapping
    public List<Voter> getAllVoters() {
        return voterRepository.findAll();
    }

    @PostMapping("/register")
    public Voter registerVoter(@RequestBody Voter voter) {
        return voterRepository.save(voter);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVoter(@PathVariable Long id) {
        voterRepository.deleteById(id);
    }

    @GetMapping("/count")
    public Long getCount() {
    return voterRepository.count();
    }
}