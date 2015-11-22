package rescueprincessdana.normalversion;

import rescueprincessdana.Questions;
import rescueprincessdana.UserInterface;
import static rescueprincessdana.UserInterface.enterToContinue;
import static rescueprincessdana.UserInterface.print;
import static rescueprincessdana.UserInterface.println;

public class Stage {

    private String message;
    private UserInterface userInput;
    private NormalQuestionsList normalQuestionsList;
    private Questions normalQuestion;
    private int questionsCount;

    public Stage(String message, NormalQuestionsList normalQuestionsList, int questionsCount) {
        this.message = message;
        this.userInput = new UserInterface();
        this.normalQuestionsList = normalQuestionsList;
        this.questionsCount = questionsCount;
        this.start(this.questionsCount);
    }

    public void start(int questionsCount) {
        System.out.println("");
        System.out.println(this.message);
        enterToContinue(this.userInput);

        for (int i = 1; i <= questionsCount; i++) {
            System.out.println("");
            System.out.println(UserInterface.GREEN + "Question number " + i + " :" + UserInterface.RESET);
            if(questionsCount==1){
                normalQuestion = normalQuestionsList.getSpecificQuestions(normalQuestionsList.getTotalCount());
            }else{
                normalQuestion = normalQuestionsList.getRandomQuestions();
            }
            println(normalQuestion.getQuestion());
            while (true) {
                System.out.println(UserInterface.BLUE + "");
                System.out.print("Your answer please: ");
                String answer = userInput.string();
                System.out.print("" + UserInterface.RESET);
                if (this.normalQuestion.isCorrect(answer)) {
                    if(questionsCount==1){
                        System.out.println("There is only one CHOICE. That's the way to GO!!!");
                        System.out.println("");
                    }else{
                        System.out.println("You are brilliant Prince!");
                        System.out.println("");
                    }
                    break;
                } else {
                    if(questionsCount==1){
                        System.out.println("There is only one CHOICE. JUST CHOOSE IT!!!");
                    }else{
                        System.out.println("Oups, your answer is incorrect. Please answer again.");
                    }
                }
            }

        }

    }
}
