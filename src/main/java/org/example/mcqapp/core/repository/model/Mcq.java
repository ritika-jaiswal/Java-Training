package org.example.mcqapp.core.repository.model;

import org.example.mcqapp.core.valueobjects.QuestionVo;

import java.util.List;

public class Mcq {
    private List<Question> questions;

    public Mcq(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

}

