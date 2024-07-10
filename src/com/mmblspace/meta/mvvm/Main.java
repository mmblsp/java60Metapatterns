package com.mmblspace.meta.mvvm;

import com.mmblspace.meta.mvp.VotePresenter;

public class Main {
    public static void main(String[] args) {
        VoteView voteView = new VoteView();
        VoteModel voteModel = new VoteModel();
        VoteViewModel voteViewModel = new VoteViewModel();
        voteViewModel.setModel(voteModel);
        voteView.setVoteViewModel(voteViewModel);
        voteView.requestVote();
        voteView.show();

    }
}
