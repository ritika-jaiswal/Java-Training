package org.example.mcqapp.core;

import org.example.mcqapp.core.data.MCQDataEnum;
import org.example.mcqapp.core.repository.model.Answer;
import org.example.mcqapp.core.repository.model.Mcq;
import org.example.mcqapp.core.repository.model.Question;
import org.example.mcqapp.core.valueobjects.QuestionVo;

import java.util.ArrayList;
import java.util.List;

public class MCQClientInterfaceImpl implements MCQClientInterface {

    private Mcq mcq;

    public MCQClientInterfaceImpl() {
        this(MCQDataEnum.DATABASE);
    }

    public MCQClientInterfaceImpl(MCQDataEnum mcqDataEnum) {
        mcq = mcqDataEnum.get();
    }

    public List<QuestionVo> getMCQs() {
        return getVoObject(mcq.getQuestions());
    }

    private List<QuestionVo> getVoObject(List<Question> questions) {
        List<QuestionVo> questionVos = new ArrayList<>();
        questions.forEach(question -> {
            questionVos.add(new QuestionVo(question));
        });
        return questionVos;
    }

    public int getResultFor(List<Integer> markedAnswers) {
        List<Question> mcQs = mcq.getQuestions();
        int score = 0;
        for (int i = 0; i < mcQs.size(); i++) {
            List<Answer> answers = mcQs.get(i).getAnswers();
            if (i < markedAnswers.size()) { //edge case where user answered less questions
                int markedAnswerIndex = markedAnswers.get(i);
                if (markedAnswerIndex >= 0 && markedAnswerIndex < answers.size()) { //edge case where user selected answer index (5) greater than the total answers (0 to 3 so 4) for that question
                    if (answers.get(markedAnswerIndex).isCorrect()) {
                        score += 1;
                    }
                }
            }
        }
        return score;
    }
}
