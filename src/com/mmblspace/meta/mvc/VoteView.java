package com.mmblspace.meta.mvc;

public class VoteView {
    private String results = "";
    private VoteController voteController;

    public VoteView() {
    }

    public void setVoteController(VoteController voteController) {
        this.voteController = voteController;
    }

    public VoteView(VoteController voteController) {
        this.voteController = voteController;
    }

    public void show() {
        System.out.println(results);
    }
    protected void setResults(String results) {
        this.results = results;
    }
    public void voteRequest() {
        voteController.workWithVote();
    }
}
