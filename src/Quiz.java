import java.util.List;
import java.util.Scanner;

public class Quiz {

    private final Scanner scanner;

    public Quiz(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runQuiz() throws InterruptedException {

        QuizBody quizBody = new QuizBody();

        List<QuizPart> quiz = quizBody.getQuiz();

        System.out.println("Welcome");
        Thread.sleep(1500);

        System.out.println("Good luck");
        Thread.sleep(1000);

        System.out.println("Starting quiz");


        Thread.sleep(2000);


        quiz.forEach(quizPart -> {
            System.out.println(quizPart.getQuestion());

            for (int i = 0; i < quizPart.getAnswers().size(); i++) {
                System.out.println((i + 1) + ". " + quizPart.getAnswers().get(i));
            }

            System.out.print("Choose answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == quizPart.getCorrectAnswer()) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
            System.out.println("\n");
        });

        Thread.sleep(1000);
        System.out.println("Thank you");

        Thread.sleep(1500);
        System.out.println("Bye");
    }
}