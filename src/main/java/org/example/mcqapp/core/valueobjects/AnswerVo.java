package org.example.mcqapp.core.valueobjects;

import org.example.mcqapp.core.repository.model.Answer;

public class AnswerVo {
    private String answer;

    public AnswerVo(Answer answer) {
        this.answer = answer.getAnswer();
    }

    public String getAnswer() {
        return answer;
    }
}
