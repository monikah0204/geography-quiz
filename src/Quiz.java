import java.util.List;
import java.util.Scanner;

public class Quiz {

    private final Scanner scanner;

    public Quiz(Scanner scanner) {
        this.scanner = scanner;
    }
    public void runQuiz(){

        QuizBody quizBody = new QuizBody();

        List<QuizPart> quiz = quizBody.getQuiz();

        System.out.println("Starting quiz");

        quiz.forEach(quizPart -> {
            System.out.println(quizPart.getQuestion());

            for (int i = 0; i < quizPart.getAnswers().size(); i++) {
                System.out.println((i + 1) + ". " + quizPart.getAnswers().get(i));
            }

            System.out.print("Choose answer: ");
            int userAnswer = scanner.nextInt();

            if(userAnswer == quizPart.getCorrectAnswer()){
                System.out.println("Correct");
            }else {
                System.out.println("Incorrect");
            }
            System.out.println("\n");
        });

        System.out.println("Thank you for your answers");

    }
}