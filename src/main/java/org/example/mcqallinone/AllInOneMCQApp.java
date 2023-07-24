package org.example.mcqallinone;

import java.util.Scanner;


public class AllInOneMCQApp {
    private static final String[] QUESTIONS = {
            "1. What is the numerical range of a char?",
            "2. You want a class to have access to members of another class in the same package. Which is the most restrictive access that accomplishes this objective?",
            "3. Which three are valid method signatures in an interface? \n(1): private int getArea(); \n(2): public float getVol(float x);\n(3): public void main(String [] args);\n (4): public static void main(String [] args);\n (5): boolean setFlag(Boolean [] test);",
            "4. What will be the output of the program?\n class Super \n{ \n    public Integer getLength() \n    {\n        return new Integer(4); \n    } \n} \n\npublic class Sub extends Super \n{ \n    public Long getLength() \n    {\n        return new Long(5); \n    } \n\n    public static void main(String[] args) \n    { \n        Super sooper = new Super(); \n        Sub sub = new Sub(); \n        System.out.println( \n        sooper.getLength().toString() + \",\" + sub.getLength().toString() ); \n    } \n}",
            "5. What will be the output of the program?\npublic class X \n{  \n    public static void main(String [] args) \n    {\n        try \n        {\n            badMethod(); /* Line 7 */\n            System.out.print(\"A\"); \n        } \n        catch (Exception ex) /* Line 10 */\n        {\n            System.out.print(\"B\"); /* Line 12 */\n        } \n        finally /* Line 14 */\n        {\n            System.out.print(\"C\"); /* Line 16 */\n        }  \n        System.out.print(\"D\"); /* Line 18 */\n    } \n    public static void badMethod() \n    {\n        throw new RuntimeException(); \n    } \n}",
            "6. Which statement is true?",
            "7. Which collection class allows you to access its elements by associating a key with an element's value, and provides synchronization?",
            "8. Which is true about a method-local inner class?",
            "9. Which two of the following methods are defined in class Thread?\n(1): start()\n(2): wait()\n(3): notify()\n(4): run()\n(5): terminate()",
            "10. Which statement is true?",

            // Add more questions here
    };

    private static final String[][] ANSWERS = {
            {"A. -128 to 127", "B. -(215) to (215) - 1", "C. 0 to 32767", "D. 0 to 65535"},
            {"A. public", "B. protected", "C. default access", "D. Private"},
            {"A. 1 and 2", "B. 2, 3 and 5", "C. 3, 4, and 5", "D. 2 and 4"},
            {"A. 4, 4", "B. 4, 5", "C. 5, 4", "D. Compilation Error"},
            {"A. AB", "B. BC", "C. CB", "D. BCD"},
            {"A. A try statement must have at least one corresponding catch block.", "B. Multiple catch statements can catch the same class of exception more than once.", "C. An Error that might be thrown in a method must be declared as thrown by that method, or be handled within that method.", "D. Except in case of VM shutdown, if a try block starts to execute, a corresponding finally block will always start to execute."},
            {"A. java.util.SortedMap", "B. java.util.TreeMap", "C. java.util.TreeSet", "D. java.util.Hashtable"},
            {"A. It must be marked final.", "B. It can be marked abstract.", "C. It can be marked public.", "D. It can be marked static."},
            {"A. 1 and 4", "B. 2 and 3", "C. 3 and 4", "D. 2 and 4"},
            {"A. The notifyAll() method must be called from a synchronized context.", "B. To call wait(), an object must own the lock on the thread.", "C. The notify() method is defined in class java.lang.Thread.", "D. The notify() method causes a thread to immediately release its locks."},
            // Add corresponding answers here
    };

    private static final int[] CORRECT_ANSWERS = {3, 2, 1, 3, 3, 3, 3, 1, 0, 0}; // Index of the correct answer for each question

    public static void main(String[] args) {
        int totalCorrectAnswers = runMCQApp();
        System.out.println("Total correct answers: " + totalCorrectAnswers);
    }

    public static int runMCQApp() {
        int totalCorrectAnswers = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < QUESTIONS.length; i++) {
//            System.out.println("Question " + (i + 1) + ":");
            System.out.println(QUESTIONS[i]);

            for (String answer : ANSWERS[i]) {
                System.out.println(answer);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().trim().toUpperCase();

            if (isValidAnswer(userAnswer)) {
                    int userChoice = userAnswer.charAt(0) - 'A';
                if (userChoice == CORRECT_ANSWERS[i]) {
                    totalCorrectAnswers++;
                    System.out.println("Correct answer!\n");
                }
            } else {
                System.out.println("Invalid answer. Skipping to the next question.");
            }
        }

        return totalCorrectAnswers;
    }

    private static boolean isValidAnswer(String answer) {
        return answer.length() == 1 && answer.charAt(0) >= 'A' && answer.charAt(0) <= 'D';
    }
}

