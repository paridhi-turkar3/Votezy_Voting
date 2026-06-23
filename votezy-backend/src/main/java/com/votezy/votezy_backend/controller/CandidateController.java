package com.votezy.votezy_backend.controller;

import com.votezy.votezy_backend.entity.Candidate;
import com.votezy.votezy_backend.repository.CandidateRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@CrossOrigin(origins = "*")
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    @PostMapping("/add")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable Long id) {
        return candidateRepository.findById(id).orElse(null);
    }

    @PutMapping("/update/{id}")
    public Candidate updateCandidate(
            @PathVariable Long id,
            @RequestBody Candidate updatedCandidate) {

        Candidate candidate = candidateRepository.findById(id).orElse(null);

        if(candidate != null){
            candidate.setName(updatedCandidate.getName());
            candidate.setParty(updatedCandidate.getParty());
            return candidateRepository.save(candidate);
        }

        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCandidate(@PathVariable Long id) {
        candidateRepository.deleteById(id);
    }

    @GetMapping("/count")
    public Long getCount() {
    return candidateRepository.count();
    }
}