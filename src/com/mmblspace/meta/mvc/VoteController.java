package com.mmblspace.meta.mvc;

import com.mmblspace.meta.Vote;

import java.util.Scanner;

public class VoteController {
    private VoteModel voteModel;

    public VoteController(VoteModel voteModel) {
        this.voteModel = voteModel;
    }

    public void workWithVote(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Do you go?");
        boolean isPresent = scanner.nextBoolean();

        System.out.println("Do you agree?");
        boolean isAgree = scanner.nextBoolean();

        System.out.println("What is your name?");
        String fio = scanner.next();

        Vote vote = new Vote(isAgree, isPresent, fio);
        voteModel.sendVote(vote);
    }
}
