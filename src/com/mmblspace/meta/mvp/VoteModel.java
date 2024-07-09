package com.mmblspace.meta.mvp;

import com.mmblspace.meta.Vote;

import java.util.LinkedList;
import java.util.List;

public class VoteModel {
    private final List<Vote> votes = new LinkedList<>();
    private long summaryPositive;
    private  long summaryNegative;
    private long summary;

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

        return vote.isValue();
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

    public List<Vote> getVotes() {
        return votes;
    }
}
