package rescueprincessdana;

import static rescueprincessdana.UserInterface.printWithSymbolBox;
import rescueprincessdana.trickyversion.FastQuestionsList;
import rescueprincessdana.trickyversion.Gate;
import rescueprincessdana.trickyversion.SmartQuestionsList;
import rescueprincessdana.trickyversion.WinGame;
import rescueprincessdana.normalversion.NormalQuestionsList;
import rescueprincessdana.normalversion.Stage;

/**
 *
 * @author vinhxu
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        UserInterface userInterface = new UserInterface();

        //Game's main loop
        while (true) {

            String versionChosen = "";
            String continueOrQuit = "";
            //Print out version choices
            System.out.println(UserInterface.PURPLE + "Please choose one \"Rescue Princess Dana\" version: \n"
                    + UserInterface.PURPLE + "[1] Normal version\n"
                    + UserInterface.PURPLE + "[2] Tricky version\n");

            //If userinput choice is not 1 or 2, continue to ask for correct input
            while (true) {
                if ((versionChosen.equals("1")) || versionChosen.equals("2")) {
                    break;
                }
                System.out.print(UserInterface.PURPLE + "Your choice (in number) is: ");
                versionChosen = userInterface.string();
            }
            System.out.println("");

            //Start version according to user's choice
            if (versionChosen.equals("1")) {
                //Start Normal version
                NormalQuestionsList normalQuestionsList = new NormalQuestionsList();
                UserInterface.printNormalVersionMessage(userInterface);

                Stage stage1 = new Stage("Hello Prince Charming!\n"
                        + "We are sorry to tell you that your beautiful princess Dana has been abducted by a gang in a boat, faraway in the sea.\n"
                        + "In order to rescue your princess, answer the FIVE following questions by typing the correct answers.", normalQuestionsList, 5);

                Stage stage2 = new Stage("Wooooow! You unlocked a treasure and you have a lot of money. Don’t waste time, go and rent a boat, hurry up!\n"
                        + "Now you are sailing….\n"
                        + "O..Ohh..OOOOhhhh!!!\n"
                        + "What’s goin’ on???\n"
                        + "Sharks are attacking your boat!!\n"
                        + "You have a message from the sharks…\n"
                        + "Sharks: If you answer the FIVE following questions by typing the correct answers and we will leave you.", normalQuestionsList, 5);

                Stage stage3 = new Stage("Good Job! Now calm down and regain your peace. You are safe\n"
                        + "Sailing…\n"
                        + "Sailing…\n"
                        + "Finally! You reached the gang’s boat.\n"
                        + "Your princess is is Screaming\n"
                        + "aa..aaaa…aaaahhh!!!\n"
                        + "The gang is attacking..\n"
                        + "What are your waiting for?\n"
                        + "Answer the FIVE following questions by typing the correct answers in order to find a sword and fight the evil gang.", normalQuestionsList, 5);

                Stage stage4 = new Stage("That’s our CHAMPION!\n"
                        + "Hurry up! Unchain your princess and set her free.\n"
                        + "Take her to you boat and sail back to the harbor.\n"
                        + "Sailing…\n"
                        + "Sailing…\n"
                        + "BOOM ….. BOOM ….. BOOM!!!!! \n"
                        + "The gang is chasing you.\n"
                        + "they are shooting you.\n"
                        + "Answer the FIVE following questions by typing the correct answers in order to speed up your boat and escape from them.", normalQuestionsList, 5);

                Stage stage5 = new Stage("There is still one ULTIMATE FINAL QUESTION you need to answer before Princess DANA is successfully rescued.", normalQuestionsList, 1);

                printWithSymbolBox("Congratulations! You struggled to rescue Princess Dana and you WON. You will have a HUGE WEDDING with her!!!", "*");
                printWithSymbolBox("THE END", "*");
            } else {
                //Start Tricky version
                SmartQuestionsList smartQuestionsList = new SmartQuestionsList();
                FastQuestionsList fastQuestionsList = new FastQuestionsList();

                UserInterface.printTrickyVersionMessage(userInterface);
                Gate gate1 = new Gate("3-HEAD MONSTER", smartQuestionsList, fastQuestionsList, true, 1);

                Gate gate2 = new Gate("DEMONIAC DEVIL", smartQuestionsList, fastQuestionsList, gate1.getGatePassed(), 2);

                Gate gate3 = new Gate("UNBEATABLE DRAGON", smartQuestionsList, fastQuestionsList, gate2.getGatePassed(), 3);

                if (gate3.getGatePassed()) {
                    WinGame.check(gate1.getWinCode(), gate2.getWinCode(), gate3.getWinCode());
                }
            }

            //Print QUIT or CONTINUE choices
            System.out.println("");
            System.out.println(UserInterface.PURPLE + "Please choose: \n"
                    + UserInterface.PURPLE + "[1] CONTINUE\n"
                    + UserInterface.PURPLE + "[2] QUIT\n");
            //If user input is 1 or 2 break while loop, otherwise keep asking for expected input
            while (true) {
                if ((continueOrQuit.equals("1")) || continueOrQuit.equals("2")) {
                    break;
                }
                System.out.print(UserInterface.PURPLE + "Your choice (in number) is: ");
                continueOrQuit = userInterface.string();
            }
            System.out.println("");
            //If user choose 1, continue with game version choice. If user choose 2, quit game.
            if(continueOrQuit.equals("2")){
                break;
            }
        }

    }

}
