package com.mmblspace.meta.mvvm;

import com.mmblspace.meta.Vote;

import java.util.LinkedList;
import java.util.List;

public class VoteModel {
    private final List<Vote> votes = new LinkedList<>();
    private long summaryPositive;
    private  long summaryNegative;
    private long summary;

    public void sendVote(Vote vote) {
        votes.add(vote);

        if (vote.isPresent()) {
            summary += vote.isValue() ? 1 : -1;
            if (vote.isValue()) {
                summaryPositive++;
            } else {
                summaryNegative++;
            }
        }
    }

    public long getSummary() {
        return summary;
    }

    public List<Vote> getVotes() {
        return votes;
    }
}
