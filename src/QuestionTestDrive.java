import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class QuestionTestDrive {
    public static void main(String[] args) {
        ArrayList<Question> quizQuestions = new ArrayList<Question>();
        int numberOfQuestions;
        ArrayList<ArrayList<String>> ans  = new ArrayList<ArrayList<String>>();

        //ArrayList<ArrayList<String>> ans  = new ArrayList<ArrayList<String>>();
//        Question q1 = new Question();
//        q1.setNumberOfAnswers(3);
//        q1.setQuestion("How many countries are there in the European Union?");

        Scanner questionsCreated = new Scanner(System.in);
        System.out.println("How many questions do you want?");
        numberOfQuestions = questionsCreated.nextInt();



        for (int i = 0; i < numberOfQuestions; i++) {
            // ask user what to create a question
            System.out.println("What is the question you would like to create? (If you're done creating questions type \"none\"");
            // assign an input to variable question
            Scanner input = new Scanner(System.in);
            String question = input.nextLine();
            if (question.equals("none")) {
                break;
            }
            // create a new question object
            // because this happens in scope of the for loop it creates a new object every iteration but
            // uses the same variable name - ask on reddit later
            Question nextQuestion = new Question();
            // set the question attribute to be whatever the question is
            nextQuestion.setQuestion(question);
            // create an arraylist for the answers for the question
            ArrayList<String> questionAnswerSet = new ArrayList<String>();
            // set this to be the answers array
            // nextQuestion.setAnswers(questionAnswerSet);

            while (true) {

                System.out.println("Do you want to add an answer? (Y/N)");
                Scanner input2 = new Scanner(System.in);
                String yOrN = input2.nextLine();
                if (yOrN.equals("N")) {
                    break;
                }

                System.out.println("Hey please enter your answer");
                Scanner addAnswer = new Scanner(System.in);
                String input3 = addAnswer.nextLine();
                // add the string to the set of answers
                questionAnswerSet.add(input3);
                // set the answers to the question object instance
                nextQuestion.setAnswers(questionAnswerSet);
                // add the set of questions (that are stored in an array list) to the main array of answers
            }



            // add this question to our array list
            quizQuestions.add(nextQuestion);
        }

/*
        // prints out questions and answers
        for (int i = 0; i < quizQuestions.size(); i++) {
            System.out.println(quizQuestions.get(i).getQuestion());
            System.out.println(quizQuestions.get(i).printAns());

            System.out.println(quizQuestions.get(i).getAnswers(quizQuestions.get(i)));
            // this shit prints out each individual answer onto one line
            for (int j =0; j< quizQuestions.get(i).getAnswers(quizQuestions.get(i)).size(); j++) {
                System.out.println(quizQuestions.get(i).getAnswers(quizQuestions.get(i)).get(j));
            }
        }*/

        // need to print the questions/answers - shuffle
        for (int i = 0; i < 5; i++) {
            // shuffle the quiz around first then once its shuffled version gets printed in the next for loop it will shuffle again
            System.out.println("Hey this is a new quiz for a student");
            Collections.shuffle(quizQuestions);
            for (int j = 0; j < quizQuestions.size(); j++) {
                System.out.println(quizQuestions.get(j).getQuestion());
                System.out.println(quizQuestions.get(j).printAns());

            }

        }

        // next steps is to ask user to define how many quizzes they want/ask how many students they have
        // Also try to print each of these quizzes onto a .txt file


    }
}
