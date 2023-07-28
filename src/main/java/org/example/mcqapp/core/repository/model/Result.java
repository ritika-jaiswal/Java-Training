package org.example.mcqapp.core.repository.model;


public final class Result {

    private static Result result;

    private String userName;
    private int score;

    public Result() {
    }

    public Result(String userName, int score) {
        this.userName = userName;
        this.score = score;
    }

}

