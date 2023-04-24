import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Jake Tammaro
 * Stores info for quizzes.
 */
public class Quiz {

    private String id;
    private String title;
    private LinkedList<Question> questions; // Enables student to go skip ahead or go back
    private int executiveFunctionScore;
    private boolean completed;
    //private int timeLimit; Not sure if these will be timed quizzes.

    public Quiz(String title, LinkedList<Question> questions, int executiveFunctionScore) {
        this.id = id;
        this.title = title;
        this.questions = questions;
        this.executiveFunctionScore = executiveFunctionScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LinkedList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(LinkedList<Question> questions) {
        this.questions = questions;
    }

    public int getExecutiveFunctionScore() {
        return executiveFunctionScore;
    }

    public void setExecutiveFunctionScore(int executiveFunctionScore) {
        this.executiveFunctionScore = executiveFunctionScore;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
