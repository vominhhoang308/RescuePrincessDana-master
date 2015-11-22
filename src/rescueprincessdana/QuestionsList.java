package rescueprincessdana;


import java.util.ArrayList;
import java.util.Random;
import rescueprincessdana.Questions;

public class QuestionsList {

    private ArrayList<Questions> questionsList;
    private Random random;
    private int totalCount;

    public QuestionsList(int totalCount) {
        this.questionsList = new ArrayList<Questions>();
        this.random = new Random();
        this.totalCount = totalCount;
    }
    
    public ArrayList<Questions> getQuestionsList(){
        return this.questionsList;
    }

    public Questions getRandomQuestions() {
        int index = this.random.nextInt(totalCount);
        Questions randomQuestion = this.questionsList.get(index);
        this.questionsList.remove(index);
        this.totalCount -= 1;
        System.out.println("");
        return randomQuestion;
    }
    
    public Questions getSpecificQuestions(int index) {
        Questions specificQuestion = this.questionsList.get(index);
        this.questionsList.remove(index);
        this.totalCount -= 1;
        System.out.println("");
        return specificQuestion;
    }
    
    public int getTotalCount(){
        return this.totalCount;
    }
    
}
