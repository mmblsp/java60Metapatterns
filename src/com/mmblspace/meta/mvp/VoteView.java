package com.mmblspace.meta.mvp;

public class VoteView {
    private String results = "";

    public void show() {
        System.out.println(results);
    }

    protected void setResults(String results) {
        this.results = results;
    }

}
