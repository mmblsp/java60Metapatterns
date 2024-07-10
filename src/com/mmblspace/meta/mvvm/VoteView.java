package com.mmblspace.meta.mvvm;

import com.mmblspace.meta.Vote;

import java.util.Scanner;

public class VoteView {
    private String results = "";
    private VoteViewModel voteViewModel;


    public void setVoteViewModel(VoteViewModel voteViewModel) {
        this.voteViewModel = voteViewModel;
    }

    public VoteView() {
    }

    public void show() {
        System.out.println(results);
    }

    public void requestVote(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Do you go?");
        boolean isPresent = scanner.nextBoolean();

        System.out.println("Do you agree?");
        boolean isAgree = scanner.nextBoolean();

        System.out.println("What is your name?");
        String fio = scanner.next();
        voteViewModel.sendVote(isAgree,isPresent, fio);
        results = voteViewModel.getCurrentResult();
    }
}
