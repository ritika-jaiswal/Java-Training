package org.example.mcqapp.core;

import org.example.mcqapp.core.data.MCQDataEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MCQClientInterfaceImplTest {

    @Test(expected = RuntimeException.class)
    public void should_return_runtime_exception_since_database_not_yet_supported() {
        new MCQClientInterfaceImpl();
    }

    @Test
    public void should_return_list_of_questions() {
        assertFalse(new MCQClientInterfaceImpl(MCQDataEnum.JSON).getMCQs().isEmpty());
    }

    @Test
    public void should_return_list_of_answers_with_questions() {
        int firstQuestion = 0;
        assertFalse(new MCQClientInterfaceImpl(MCQDataEnum.JSON).getMCQs().get(firstQuestion).getAnswers().isEmpty());
    }

    @Test
    public void should_return_score_as_zero_since_markedAnswers_are_out_of_range() {
        int zeroScore = 0;

        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 4, 5, 6);
        assertEquals(zeroScore, new MCQClientInterfaceImpl(MCQDataEnum.JSON).getResultFor(list));
    }

    @Test
    public void should_return_score_as_one_since_only_first_answer_is_correct() {
        int oneScore = 1;

        List<Integer> list = Arrays.asList(3);
        assertEquals(oneScore, new MCQClientInterfaceImpl(MCQDataEnum.JSON).getResultFor(list));
    }
}