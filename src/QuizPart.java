import java.util.List;

public class QuizPart {
    private final int quizPartId;
    private final String question;
    private final List<String> answers;
    private final int correctAnswer;

    public QuizPart(int quizPartId, String question, List<String> answers, int correctAnswer) {
        this.quizPartId = quizPartId;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public int getQuizPartId() {
        return quizPartId;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
