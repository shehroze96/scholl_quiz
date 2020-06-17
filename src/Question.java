import java.util.*;

public class Question {
    // may need to use a dictionary of some kind
    // need a question and one correct answer

    // map of a list - allows us to have a key with multiple values instead of "key value pair"
    // Map<Object, ArrayList<Object>> questionsAndAnswers = new HashMap<>();

    private String question = null;
    private ArrayList<String> answers = new ArrayList<String>();
    private int numberOfStudents = 0;

    public void setQuestion(String q) {
        question = q;
    }

    public String getQuestion() {
        // print out entire question details
        return question;
    }

    public void setNumberOfStudents(int a) {
        if (a > 0) {
            numberOfStudents = a;
        }
    }

    public ArrayList getAnswers(Question q) {
        return q.answers;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setAnswers(ArrayList ans) {
        answers = ans;
    }

    public void getQNA() {
        getQuestion();
        printAns();
    }

    public String printAns() {
        String listOfAnswers = "";
        // added this to randomise the order of the questions
        Collections.shuffle(answers);
        // print each string answer in the answers arraylist
        for (String answer: answers) {
            listOfAnswers += answer + "\n";
        }
        return listOfAnswers;
    }

    public void randomiseOrder() {
        
    }

    public void returnAllQuizVariants() {
        // print out the variants of the quiz, which should be shuffled for each student.
        // if there are 15 students there should be 15 versions of the quiz where the questions and answer options are different
    }
}
