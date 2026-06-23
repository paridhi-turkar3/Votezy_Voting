package com.votezy.votezy_backend.dto;

public class WinnerResponse {

    private String winnerName;
    private String winnerParty;
    private long votes;

    public WinnerResponse(
            String winnerName,
            String winnerParty,
            long votes) {

        this.winnerName = winnerName;
        this.winnerParty = winnerParty;
        this.votes = votes;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public String getWinnerParty() {
        return winnerParty;
    }

    public long getVotes() {
        return votes;
    }
}