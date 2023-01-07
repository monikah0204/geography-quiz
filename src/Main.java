import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz geographyQuiz = new Quiz(scanner);

        try {
            geographyQuiz.runQuiz();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
