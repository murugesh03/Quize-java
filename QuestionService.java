import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];

    public QuestionService() {
        // Initialize questions array with some dummy data
        questions[0] = new Question(1, "Size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A: " + q.getOpt1());
            System.out.println("B: " + q.getOpt2());
            System.out.println("C: " + q.getOpt3());
            System.out.println("D: " + q.getOpt4());
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Your score is: " + score + " out of " + questions.length);
    }

}