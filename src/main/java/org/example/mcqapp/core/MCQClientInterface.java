package org.example.mcqapp.core;

import org.example.mcqapp.core.data.MCQDataEnum;
import org.example.mcqapp.core.model.Question;

import java.util.List;

public interface MCQClientInterface {
    List<Question> getMCQs();

    int getResultFor(List<Integer> markedAnswers);
}
