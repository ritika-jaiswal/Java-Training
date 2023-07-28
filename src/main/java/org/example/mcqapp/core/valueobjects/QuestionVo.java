package org.example.mcqapp.core.valueobjects;

import org.example.mcqapp.core.repository.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionVo {
    private String question;
    private List<AnswerVo> answers;

    public QuestionVo(Question question) {
        question.getAnswers().forEach(answer -> {
            answers.add(new AnswerVo(answer));
        });
    }
    public String getQuestion() {
        return question;
    }

    public List<AnswerVo> getAnswers() {
        return answers;
    }
}
