import java.util.List;

/**
 * @author Jake Tammaro
    Stores info on individual questions for the quizzes.
 */

public class Question {
    private String questionText;
    private List<String> answerChoices;
    private int correctAnswerIndex;

    public Question(String questionText, List<String> answerChoices, int correctAnswerIndex) {
        this.questionText = questionText;
        this.answerChoices = answerChoices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getAnswerChoices() {
        return answerChoices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswerChoices(List<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }
}