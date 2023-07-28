package org.example.mcqapp.core;

import org.example.mcqapp.core.repository.model.Question;
import org.example.mcqapp.core.valueobjects.QuestionVo;

import java.util.List;

public interface MCQClientInterface {
    List<QuestionVo> getMCQs();

    int getResultFor(List<Integer> markedAnswers);
}
