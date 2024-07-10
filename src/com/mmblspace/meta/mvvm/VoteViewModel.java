package com.mmblspace.meta.mvvm;

import com.mmblspace.meta.Vote;

public class VoteViewModel {
    public void setModel(VoteModel model) {
        this.model = model;
    }

    private  VoteModel model;

    public void sendVote(boolean isAgree, boolean isPresent, String fio){
        Vote vote = new Vote(isAgree, isAgree, fio);
        model.sendVote(vote);
    }
    public String calculateResults(){
        StringBuilder sb = new StringBuilder();
        for (Vote vote: model.getVotes()) {
            sb.append(vote.toString());
        }
        sb.append("\nsummary is: ");
        sb.append(model.getSummary());
        return sb.toString();
    }
    public String getCurrentResult(){
        return  calculateResults();
    }

}
