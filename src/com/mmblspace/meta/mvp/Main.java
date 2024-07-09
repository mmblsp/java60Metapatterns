package com.mmblspace.meta.mvp;

public class Main {
    public static void main(String[] args) {
        VoteView voteView = new VoteView();
        VoteModel voteModel = new VoteModel();
        VotePresenter votePresenter = new VotePresenter(voteView, voteModel);

        votePresenter.workWithVote();
        voteView.show();

    }
}
