package com.mmblspace.meta.mvc;

public class Main {
    public static void main(String[] args) {
        VoteView voteView = new VoteView();
        VoteModel voteModel = new VoteModel(voteView);
        VoteController voteController = new VoteController(voteModel);
        voteView.setVoteController(voteController);

        voteView.voteRequest();
        voteView.show();

    }
}
