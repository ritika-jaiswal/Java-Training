package org.example.mcqapp.console;

import org.example.mcqapp.core.MCQClientInterface;
import org.example.mcqapp.core.MCQClientInterfaceImpl;
import org.example.mcqapp.core.data.MCQDataEnum;
import org.example.mcqapp.core.model.Answer;
import org.example.mcqapp.core.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleAppMain {
    public static void main(String[] args) {
        try {
            MCQClientInterface mcqClientInterface = new MCQClientInterfaceImpl(MCQDataEnum.JSON);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name to start test:");
            String userName = scanner.nextLine();
            List<Question> mcQs = mcqClientInterface.getMCQs();
            List<Integer> userSelections = new ArrayList<>();
            for (int i = 0; i < mcQs.size(); i++) {
                System.out.println((i + 1) + "). " + mcQs.get(i).getQuestion());
                List<Answer> answers = mcQs.get(i).getAnswers();
                for (int j = 0; j < answers.size(); j++) {
                    System.out.println((j + 1) + ". " + answers.get(j).getAnswer());
                }
                System.out.println("Select answer:");
                int userSelection = scanner.nextInt() - 1;
                userSelections.add(userSelection);
            }
            System.out.println(userSelections);
            System.out.println("Hi " + userName + " your score is " + mcqClientInterface.getResultFor(userSelections));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Something went wrong, rerun test!");
        }
    }
}
