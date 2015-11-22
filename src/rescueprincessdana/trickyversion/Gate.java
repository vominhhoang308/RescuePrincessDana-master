package rescueprincessdana.trickyversion;

import rescueprincessdana.UserInterface;
import rescueprincessdana.Questions;
import java.util.Random;
import static rescueprincessdana.UserInterface.enterToContinue;
import static rescueprincessdana.UserInterface.print;
import static rescueprincessdana.UserInterface.printWithSymbolBox;
import static rescueprincessdana.UserInterface.println;

public class Gate {

    private String masterName;
    private String princeType;
    private UserInterface userInput;
    private SmartQuestionsList smartQuestionsList;
    private FastQuestionsList fastQuestionsList;
    private Questions smartQuestion;
    private Questions fastQuestion;
    private boolean gatePassed;
    private int winCode;
    private int level;

    public Gate(String masterName, SmartQuestionsList smartQuestionsList, FastQuestionsList fastQuestionsList, boolean gatePassed, int level) {
        this.masterName = masterName;
        this.princeType = "\n"
                + "\"Who do you think you are? My dear Prince!\". He asks.\n"
                + "[1] A smart prince.\n"
                + "[2] A fast prince.\n"
                + "[3] A strong prince.\n"
                + "Your choice (in number): ";
        this.userInput = new UserInterface();
        this.smartQuestionsList = smartQuestionsList;
        this.fastQuestionsList = fastQuestionsList;
        this.smartQuestion = new Questions();
        this.fastQuestion = new Questions();
        this.gatePassed = gatePassed;
        this.winCode = 0;
        this.level = level;
        this.start(this.level);
    }

    public boolean handleSmartChoice(boolean currentGatePassed, int level) {
        if (level < 2) {
            printWithSymbolBox("To beat the " + this.masterName + ", you need to answer " + level + " question CORRECTLY", ".");
            enterToContinue(this.userInput);
        } else {
            printWithSymbolBox("To beat the " + this.masterName + ", you need to answer " + level + " questions CORRECTLY", ".");
            enterToContinue(this.userInput);
        }

        for (int i = 0; i < level; i++) {
            currentGatePassed = false;
            smartQuestion = smartQuestionsList.getRandomQuestions();
            println(smartQuestion.getQuestion());
            print("Your choice (in number): ");
            String answer = userInput.string();
            println("");
            if (smartQuestion.isCorrect(answer)) {
                if (i == (level - 1)) {
                    printWithSymbolBox("You WIN, Prince! You are really SMART. You passed this gate, but more challanges are comming soon!", ".");
                    enterToContinue(this.userInput);
                } else {
                    printWithSymbolBox("Correct! Prince, you are SMART", ".");
                    enterToContinue(this.userInput);
                }

                currentGatePassed = true;
                this.winCode = 1;
            } else {
                printWithSymbolBox("You LOSE, Prince! You are NOT that SMART. Come back when you are SMARTER!", ".");
                break;
            }
        }

        return currentGatePassed;
    }

    public boolean handleFastChoice(boolean currentGatePassed, int level) {
        int timeLimit = 0;
        switch (level) {
            case 1:
                timeLimit = 15;
                break;
            case 2:
                timeLimit = 10;
                break;
            case 3:
                timeLimit = 8;
                break;
        }

        printWithSymbolBox("To beat the " + this.masterName + ", you need to answer his question FAST (within " + timeLimit + " seconds) and CORRECTLY", ".");
        enterToContinue(this.userInput);

        fastQuestion = fastQuestionsList.getRandomQuestions();
        println(fastQuestion.getQuestion());
        long start = System.currentTimeMillis();
        print("Your answer (within " + timeLimit + " seconds): ");
        String answer = userInput.string();

        println("");
        long elapsedTime = (System.currentTimeMillis() - start) / 1000;
        println("You solved the problem in " + elapsedTime + " seconds");
        println("");

        if (elapsedTime <= timeLimit) {
            if (fastQuestion.isCorrect(answer)) {
                printWithSymbolBox("You WIN, Prince! You are really FAST and ACCURATE. You passed this gate, but more challanges are comming soon!", ".");
                enterToContinue(this.userInput);
                currentGatePassed = true;
                this.winCode = 2;
            } else {
                printWithSymbolBox("You LOSE, Prince! You are FAST but NOT PRECISE. You can not rescue Princess DANA!", ".");
            }
        } else {
            printWithSymbolBox("You LOSE, Prince. You think you are FAST, but you are NOT!", ".");
        }
        return currentGatePassed;
    }

    public boolean handleStrongChoice(boolean currentGatePassed, int level) {
        int yourHealthPoints = 100;
        int yourDamage = 0;
        int enemyHealthPoints = 0;
        int enemyDamage = 0;
        int indexWeaponChosen = 0;
        int indexArmourChosen = 0;
        String weaponChosen = "";
        String armourChosen = "";

        switch (level) {
            case 1:
                enemyHealthPoints = 100;
                enemyDamage = 0;
                break;
            case 2:
                enemyHealthPoints = 125;
                enemyDamage = 3;
                break;
            case 3:
                enemyHealthPoints = 150;
                enemyDamage = 6;
                break;
        }
        Random random = new Random();
        int indexElement = 0;
        int randomElement = random.nextInt(5) + 1;
        String chosenElement = "";
        

        switch (randomElement) {
            case 1:
                chosenElement = "WOOD";
                indexElement = 1;
                break;
            case 2:
                chosenElement = "FIRE";
                indexElement = 2;
                break;
            case 3:
                chosenElement = "EARTH";
                indexElement = 3;
                break;
            case 4:
                chosenElement = "METAL";
                indexElement = 4;
                break;
            case 5:
                chosenElement = "WATER";
                indexElement = 5;
                break;
        }
        printWithSymbolBox("To beat the " + this.masterName + ", you need to FIGHT!", ".");
        println("");
        println(this.masterName + " is a " + chosenElement + "-element monster." + "\n");
        enterToContinue(this.userInput);
        println("Your initial health points: " + yourHealthPoints);
        println(this.masterName + "'s health points: " + enemyHealthPoints);
        enterToContinue(this.userInput);

        println("Choose your weapon: \n" + "[1] WOOD-element knife\n" + "[2] FIRE-element spear\n"
                + "[3] EARTH-element mace\n" + "[4] METAL-element hammer\n" + "[5] WATER-element sword\n");
        
        //If userinput choice is not 1,2,3,4 or 5, continue to ask for correct input
        while (true) {
            if ((weaponChosen.equals("1")) || weaponChosen.equals("2") || weaponChosen.equals("3") || weaponChosen.equals("4") || weaponChosen.equals("5")) {
                break;
            }
            print("Your chosen weapon (in number): ");
            weaponChosen = userInput.string();
        }
        indexWeaponChosen = Integer.parseInt(weaponChosen);
        switch (indexWeaponChosen - indexElement) {
            case -4:
                yourDamage += 5;
                break;
            case -3:
                yourDamage += -10;
                break;
            case -2:
                yourDamage += 10;
                break;
            case -1:
                yourDamage += -5;
                break;
            case 0:
                yourDamage += 0;
                break;
            case 1:
                yourDamage += 5;
                break;
            case 2:
                yourDamage += -10;
                break;
            case 3:
                yourDamage += 10;
                break;
            case 4:
                yourDamage += -5;
                break;
        }
        
        println("");
        println("Choose your armour: \n" + "[1] WOOD-element arm armour\n" + "[2] FIRE-element body armour\n"
                + "[3] EARTH-element leg armour\n" + "[4] METAL-element shield\n" + "[5] WATER-element helmet\n");
        
        //If userinput choice is not 1,2,3,4 or 5, continue to ask for correct input
        while (true) {
            if ((armourChosen.equals("1")) || armourChosen.equals("2") || armourChosen.equals("3") || armourChosen.equals("4") || armourChosen.equals("5")) {
                break;
            }
            print("Your chosen armour (in number): ");
            armourChosen = userInput.string();
        }
        indexArmourChosen = Integer.parseInt(armourChosen);
        println("");
        switch (indexArmourChosen - indexElement) {
            case -4:
                enemyDamage += -5;
                break;
            case -3:
                enemyDamage += 10;
                break;
            case -2:
                enemyDamage += -10;
                break;
            case -1:
                enemyDamage += 5;
                break;
            case 0:
                enemyDamage += 0;
                break;
            case 1:
                enemyDamage += -5;
                break;
            case 2:
                enemyDamage += 10;
                break;
            case 3:
                enemyDamage += -10;
                break;
            case 4:
                enemyDamage += 5;
                break;
        }
        
        while (true) {
            //Gate master's attack
            int randomDamage = random.nextInt(10) + 10;
            yourHealthPoints -= (enemyDamage + randomDamage);
            if (yourHealthPoints <= 0) {
                yourHealthPoints = 0;

            }
            //Prince's attact
            randomDamage = random.nextInt(10) + 10;
            enemyHealthPoints -= (yourDamage + randomDamage);
            if (enemyHealthPoints <= 0) {
                enemyHealthPoints = 0;
            }

            println("Your health points: " + yourHealthPoints);
            println(this.masterName + "'s health points: " + enemyHealthPoints);
            println("");
            if (yourHealthPoints == 0) {
                printWithSymbolBox("You LOSE, Prince! I heard you said you are STRONG. HUH?", ".");
                break;
            } else if (enemyHealthPoints == 0) {
                printWithSymbolBox("You WIN, Prince! You are really STRONG. You passed this gate, but more challanges are comming soon!", ".");
                currentGatePassed = true;
                this.winCode = 3;
                break;
            }

        }
        return currentGatePassed;

    }

    public void start(int level) {
        //Initial value of currentGatePassed is "false" and will change to "true" if win the gate. 
        boolean currentGatePassed = false;
        //If previous gate is passed, current gate will operate. Otherwise, there is no activity.
        String levelInString = "";
        if (this.gatePassed) {
            switch (level) {
                case 1:
                    levelInString = "FIRST";
                    break;
                case 2:
                    levelInString = "SECOND";
                    break;
                case 3:
                    levelInString = "THIRD";
                    break;
            }
            printWithSymbolBox("The " + levelInString + " gate master is a " + this.masterName, ".");
            print(princeType);

            String typeChoice = userInput.string();
            println("");

            //If userinput choice is not 1,2 or 3, continue to ask for correct input
            while (true) {
                if ((typeChoice.equals("1")) || typeChoice.equals("2") || typeChoice.equals("3")) {
                    break;
                }
                print("Your choice (in number): ");
                typeChoice = userInput.string();
            }

            //If user choice is 1, handleSmartChoice method is called
            if (typeChoice.equals("1")) {
                this.gatePassed = this.handleSmartChoice(currentGatePassed, level);
            }

            if (typeChoice.equals("2")) {
                this.gatePassed = this.handleFastChoice(currentGatePassed, level);
            }

            if (typeChoice.equals("3")) {
                this.gatePassed = this.handleStrongChoice(currentGatePassed, level);
            }

        }
    }

    public boolean getGatePassed() {
        return this.gatePassed;
    }

    public int getWinCode() {
        return winCode;
    }

}
