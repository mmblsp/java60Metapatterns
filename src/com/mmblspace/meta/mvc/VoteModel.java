package com.mmblspace.meta.mvc;

import com.mmblspace.meta.Vote;
import java.util.LinkedList;
import java.util.List;

public class VoteModel {
    private final List<Vote> votes = new LinkedList<>();
    private long summaryPositive;
    private  long summaryNegative;
    private long summary;
    private final VoteView voteView;

    public VoteModel(VoteView voteView) {
        this.voteView = voteView;
    }

    public boolean sendVote(Vote vote) {
        votes.add(vote);

        if (vote.isPresent()) {
            summary += vote.isValue() ? 1 : -1;
            if (vote.isValue()) {
                summaryPositive++;
            } else {
                summaryNegative++;
            }
        }

        voteView.setResults(calculateResults());

        return vote.isValue();
    }

    private String calculateResults(){
        StringBuilder sb = new StringBuilder();
        for (Vote vote: votes) {
            sb.append(vote.toString());
        }
            sb.append("\nsummary is: ");
            sb.append(summary);
        return sb.toString();
    }

    public long getSummaryPositive() {
        return summaryPositive;
    }

    public long getSummaryNegative() {
        return summaryNegative;
    }

    public long getSummary() {
        return summary;
    }
}
