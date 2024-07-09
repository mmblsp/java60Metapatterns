package com.mmblspace.meta.mvp;

public class VoteView {
    private String results = "";
    private  VotePresenter votePresenter;

    public void show() {
        System.out.println(results);
    }

    public void setVotePresenter(VotePresenter votePresenter) {
        this.votePresenter = votePresenter;
    }

    protected void setResults(String results) {
        this.results = results;
    }

    public void requestVote(){
        votePresenter.workWithVote();
    }
}
