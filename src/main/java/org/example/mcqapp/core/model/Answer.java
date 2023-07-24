package org.example.mcqapp.core.model;


public final class Answer {

    private String answer;
    private boolean isCorrect;

    public Answer() {
    }

    public Answer(String answer, boolean isCorrect) {
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

}
