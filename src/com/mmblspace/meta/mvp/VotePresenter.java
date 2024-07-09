package com.mmblspace.meta.mvp;

import com.mmblspace.meta.Vote;
import java.util.List;
import java.util.Scanner;

public class VotePresenter {
    private VoteView voteView;
    private VoteModel voteModel;

    public VotePresenter(VoteView voteView, VoteModel voteModel) {
        this.voteView = voteView;
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
        voteView.setResults(calculateResults(voteModel.getVotes(),
                                             voteModel.getSummary()));
    }
    private String calculateResults(List<Vote> votes, long summary){
        StringBuilder sb = new StringBuilder();
        for (Vote vote: votes) {
            sb.append(vote.toString());
        }
        sb.append("\nsummary is: ");
        sb.append(summary);
        return sb.toString();
    }
}
