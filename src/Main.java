import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz geographyQuiz = new Quiz(scanner);

        geographyQuiz.runQuiz();
    }
}
