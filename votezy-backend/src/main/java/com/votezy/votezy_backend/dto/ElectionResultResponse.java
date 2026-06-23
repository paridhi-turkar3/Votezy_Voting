package com.votezy.votezy_backend.dto;

public class ElectionResultResponse {

    private String electionName;
    private Long winnerId;
    private String winnerName;
    private String winnerParty;
    private Long winnerVotes;
    private Long totalVotes;

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }

    public Long getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Long winnerId) {
        this.winnerId = winnerId;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    public String getWinnerParty() {
        return winnerParty;
    }

    public void setWinnerParty(String winnerParty) {
        this.winnerParty = winnerParty;
    }

    public Long getWinnerVotes() {
        return winnerVotes;
    }

    public void setWinnerVotes(Long winnerVotes) {
        this.winnerVotes = winnerVotes;
    }

    public Long getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Long totalVotes) {
        this.totalVotes = totalVotes;
    }
}