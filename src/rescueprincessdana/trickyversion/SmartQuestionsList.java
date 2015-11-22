
package rescueprincessdana.trickyversion;

import rescueprincessdana.QuestionsList;
import rescueprincessdana.Questions;
import java.util.ArrayList;
import java.util.Random;

public class SmartQuestionsList extends QuestionsList {

    public SmartQuestionsList() {
        super(21);
        
        Questions question1 = new Questions("Which one of the five choices makes the best comparison? LIVED is to DEVIL as 6323 is to:\n"
                          +"[1] 2336\n"
                          +"[2] 6232\n"
                          +"[3] 3236\n"
                          +"[4] 3326\n"
                          +"[5] 6332\n","3");
        
        Questions question2 = new Questions("Which one of these is least like the four?\n"
                          +"[1] Horse\n"
                          +"[2] Kangaroo\n"
                          +"[3] Goat\n"
                          +"[4] Deer\n"
                          +"[5] Donkey\n","2");
        
        Questions question3 = new Questions("Which number should come next? 144 121 100 81 64\n"
                          +"[1] 14\n"
                          +"[2] 36\n"
                          +"[3] 49\n"
                          +"[4] 53\n"
                          +"[5] 66\n","3");
        
        Questions question4 = new Questions("HAND is to Glove as HEAD is to\n"
                          +"[1] Hair\n"
                          +"[2] Neck\n"
                          +"[3] Hairpin\n"
                          +"[4] Earring\n"
                          +"[5] Hat\n","5");
        
        Questions question5 = new Questions("John likes 400 but not 300; he likes 100 but not 99; he likes 3600 but not 3700. Which does he like?\n"
                          +"[1] 900\n"
                          +"[2] 1000\n"
                          +"[3] 1100\n"
                          +"[4] 1200\n"
                          +"[5] 1300\n","1");
        
        Questions question6 = new Questions("If you rearrange the letters \"ANLDEGN,\" you would have the name of a(n):\n"
                          +"[1] Ocean\n"
                          +"[2] Country\n"
                          +"[3] State\n"
                          +"[4] City\n"
                          +"[5] Animal\n","2");
        
        Questions question7 = new Questions("NASA received three messages in a strange language from a distant planet.\n"
                          +"The scientists studied the messages and found that \"Necor Buldon Slock\" means \"Danger Rocket Explosion\"\n"
                          +"and \"Edwan Mynor Necor\" means \"Danger Spaceship Fire\"\n"
                          +"and \"Buldon Gimilzor Gondor\" means \"Bad Gas Explosion\". What does \"Slock\" mean?\n"
                          +"[1] Danger\n"
                          +"[2] Explosion\n"
                          +"[3] Nothing\n"
                          +"[4] Rocket\n"
                          +"[5] Gas\n","4");
        
        Questions question8 = new Questions("Which one of the five is least like the other four?\n"
                          +"[1] Dog\n"
                          +"[2] Mouse\n"
                          +"[3] Lion\n"
                          +"[4] Snake\n"
                          +"[5] Elephant\n","4");
        
        Questions question9 = new Questions("Which number should come next in the series?\n" 
                          +"1 - 1 - 2 - 3 - 5 - 8 - 13\n"
                          +"[1] 8\n"
                          +"[2] 13\n"
                          +"[3] 21\n"
                          +"[4] 26\n"
                          +"[5] 31\n","3");
        
        Questions question10 = new Questions("Mary, who is sixteen years old, is four times as old as her brother.\n" 
                          +"How old will Mary be when she is twice as old as her brother?\n"
                          +"[1] 24\n"
                          +"[2] 28\n"
                          +"[3] 20\n"
                          +"[4] 26\n"
                          +"[5] 21\n","1");
        
        Questions question11 = new Questions("Which one of the numbers does not belong in the following series?\n" 
                          +"2 - 3 - 6 - 7 - 8 - 14 - 15 - 30\n"
                          +"[1] 3\n"
                          +"[2] 7\n"
                          +"[3] 8\n"
                          +"[4] 15\n"
                          +"[5] 30\n","3");
        
        Questions question12 = new Questions("Which one of the five choices makes the best comparison?\n" 
                          +"Finger is to Hand as Leaf is to:\n"
                          +"[1] Tree\n"
                          +"[2] Branch\n"
                          +"[3] Bark\n"
                          +"[4] Twig\n"
                          +"[5] Blossom\n","2");
        
        Questions question13 = new Questions("If you rearrange the letters \"GMNOEK\" you would have the name of a(n):\n"
                          +"[1] City\n"
                          +"[2] Animal\n"
                          +"[3] River\n"
                          +"[4] Ocean\n"
                          +"[5] Country\n","3");
        
        Questions question14 = new Questions("John needs 13 bottles of water from the store.\n" 
                          +"John can only carry 3 at a time.\n"
                          +"What's the minimum number of trips John needs to make to the store?\n"
                          +"[1] 3\n"
                          +"[2] 4\n"
                          +"[3] 4.5\n"
                          +"[4] 5\n"
                          +"[5] 6\n","4");
        
        Questions question15 = new Questions("If all Bloops are Razzies and all Razzies are Lazzies, all Bloops are definitely Lazzies?\n"
                          +"[1] True\n"
                          +"[2] False\n"
                          +"[3] Neither\n","1");
        
        Questions question16 = new Questions("Which one of the numbers does not belong in the following series?\n" 
                          +"1 - 2 - 5 - 10 - 13 - 26 - 29 - 48\n"
                          +"[1] 1\n"
                          +"[2] 5\n"
                          +"[3] 10\n"
                          +"[4] 29\n"
                          +"[5] 48\n","5");
        
        Questions question17 = new Questions("What is the missing number in the sequence shown below?\n" 
                          +"1 - 8 - 27 - ? - 125 - 216\n"
                          +"[1] 64\n"
                          +"[2] 144\n"
                          +"[3] 44\n"
                          +"[4] 99\n"
                          +"[5] 86\n","1");
        
        Questions question18 = new Questions("Which one of the following things is the least like the others?\n"
                          +"[1] Table\n"
                          +"[2] Novel\n"
                          +"[3] Building\n"
                          +"[4] Statue\n"
                          +"[5] Flower\n","5");
        
        Questions question19 = new Questions("If some Wicks are Slicks, and some Slicks are Snicks, then some Wicks are definitely Snicks.\n" 
                          +"The statement is:\n"
                          +"[1] True\n"
                          +"[2] False\n"
                          +"[3] Neither\n","2");
        
        Questions question20 = new Questions("In a race from point X to point Y and back,\n"
                          +"Jack averages 30 miles per hour to point Y and 10 miles per hour back to point X.\n"
                          +"Sandy averages 20 miles per hour in both directions.\n"
                          +"If Jack and Sandy begin the race at the same time, who will finish first?\n"
                          +"[1] Jack\n"
                          +"[2] Sandy\n"
                          +"[3] They tie\n"
                          +"[4] Neither\n"
                          +"[5] Impossible to tell\n","2");
        
        Questions question21 = new Questions("A cynic is one who knows the price of everything and the ________ of nothing.\n" 
                          +"Fill in the blank.\n"
                          +"[1] Emotion\n"
                          +"[2] Meaning\n"
                          +"[3] Color\n"
                          +"[4] Quality\n"
                          +"[5] Value\n","5");
        
        
        this.getQuestionsList().add(question1);
        this.getQuestionsList().add(question2);
        this.getQuestionsList().add(question3);
        this.getQuestionsList().add(question4);
        this.getQuestionsList().add(question5);
        this.getQuestionsList().add(question6);
        this.getQuestionsList().add(question7);
        this.getQuestionsList().add(question8);
        this.getQuestionsList().add(question9);
        this.getQuestionsList().add(question10);
        this.getQuestionsList().add(question11);
        this.getQuestionsList().add(question12);
        this.getQuestionsList().add(question13);
        this.getQuestionsList().add(question14);
        this.getQuestionsList().add(question15);
        this.getQuestionsList().add(question16);
        this.getQuestionsList().add(question17);
        this.getQuestionsList().add(question18);
        this.getQuestionsList().add(question19);
        this.getQuestionsList().add(question20);
        this.getQuestionsList().add(question21);
    }

}
    
    
    
    
    

