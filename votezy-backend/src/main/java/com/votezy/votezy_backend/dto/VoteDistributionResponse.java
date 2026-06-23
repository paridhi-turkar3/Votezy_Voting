package com.votezy.votezy_backend.dto;

public class VoteDistributionResponse {

    private String candidateName;
    private Long votes;

    public VoteDistributionResponse(
            String candidateName,
            Long votes) {

        this.candidateName = candidateName;
        this.votes = votes;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public Long getVotes() {
        return votes;
    }
}