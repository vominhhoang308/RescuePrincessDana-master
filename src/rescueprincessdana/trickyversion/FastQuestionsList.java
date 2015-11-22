package rescueprincessdana.trickyversion;

import rescueprincessdana.QuestionsList;
import rescueprincessdana.Questions;
import java.util.ArrayList;
import java.util.Random;

public class FastQuestionsList extends QuestionsList {

    public FastQuestionsList() {
        super(21);
        
        Questions question1 = new Questions("Mary’s Father Has Five Daughters: 1. Nana, 2. Nene, 3. Nini, 4. Nono."
                                            +"What Is The Name Of The Fifth Daughter?\n"
                                            ,"mary");
        
        Questions question2 = new Questions("You Are In A Race. You Overtake The Second Person."
                                            +"What Position Are You In (answer in number)?\n"
                                            ,"2");
        
        Questions question3 = new Questions("You Are In A Race. You Overtake The Last Person,"
                                            +"Then You Are…(answer in number)?\n"
                                            +"[1] Second to last person\n"
                                            +"[2] Last person\n"
                                            +"[3] What kind of question is it?\n"
                                            ,"3");
        
        Questions question4 = new Questions("Take 1000 And Add 40 To It. Now Add Another 1000 . Now Add 30.\n"
                                            +"Add Another 1000. Now Add 20. Now Add Another 1000. Now Add 10.\n"
                                            +"What Is The Total (answer in number)?\n"
                                            ,"4100");
                          
        
        Questions question5 = new Questions("How many * in the picture (answer in number)?\n"
                                            +"*********\n"
                                            +" *******\n"
                                            +"  *****\n"
                                            +"   ***\n"
                                            +"    *\n"
                                            ,"25");
        
        Questions question6 = new Questions("Choose the number that is 1/4 of 1/2 of 1/5 of 200 (answer in number):\n"
                          +"[1] 2\n"
                          +"[2] 10\n"
                          +"[3] 15\n"
                          +"[4] 3\n"
                          +"[5] 5\n","5");
        
        Questions question7 = new Questions("Ann is taller than Jill, and Kelly is shorter than Ann.\n" 
                          +"Which of the following statements would be most accurate (answer in number)?\n"
                          +"[1] Kelly is taller than Jill\n"
                          +"[2] Kelly is shorter than Jill\n"
                          +"[3] Kelly is as tall as Jill\n"
                          +"[4] It's impossible to tell\n","4");
        
        Questions question8 = new Questions("A boy is 4 years old and his sister is three times as old as he is.\n" 
                          +"When the boy is 12 years old, how old will his sister be (answer in number)?\n"
                          ,"20");
        
        Questions question9 = new Questions("Assume that these two statements are true: All brown-haired men have bad tempers. Larry is a brown-haired man.\n" 
                          +"The statement Larry has a bad temper is:\n"
                          +"[1] True\n"
                          +"[2] False\n"
                          +"[3] Unable to determine\n","1");
        
        Questions question10 = new Questions("Two girls caught 25 frogs. Lisa caught four times as many as Jen did.\n" 
                          +"How many frogs did Jen catch (answer in number)?\n"
                          ,"5");
        
        Questions question11 = new Questions("A car traveled 14 miles in 15 minutes.\n" 
                          +"How many miles per hour was it traveling (answer in number)?\n"
                          ,"56");
        
        Questions question12 = new Questions("If all Zips are Zoodles, and all Zoodles are Zonkers, then all Zips are definitely Zonkers.\n" 
                          +"The above sentence is logically (answer in number):\n"
                          +"[1] True\n"
                          +"[2] False\n"
                          +"[3] Neither\n","1");
        
        Questions question13 = new Questions("Sue is both the 50th best and the 50th worst student at her school.\n" 
                          +"How many students attend her school (answer in number)?\n"
                          ,"99");
        
        Questions question14 = new Questions("Ten people can paint 60 houses in 120 days,\n" 
                          +"so five people can paint 30 houses in how many days (answer in number):\n"
                          ,"120");
        
        Questions question15 = new Questions("The pure and simple truth is rarely pure and never ________.\n" 
                          +"Fill in the blank (answer in number).\n"
                          +"[1] Complete\n"
                          +"[2] Accurate\n"
                          +"[3] Complex\n"
                          +"[4] Simple\n"
                          +"[5] Wise\n","4");
        
        Questions question16 = new Questions("Which number should come next? 64, 16, 4, 1, ¼ ?\n"
                          +"[1] 1/16\n"
                          +"[2] 1/12\n"
                          +"[3] 1/8\n"
                          +"[4] 1/2\n"
                          +"[5] 1\n","1");
        
        Questions question17 = new Questions("What number is one half of one quarter of one tenth of 800?\n"
                          +"[1] 2\n"
                          +"[2] 5\n"
                          +"[3] 8\n"
                          +"[4] 10\n"
                          +"[5] 40\n","4");
        
        Questions question18 = new Questions("How many . in the picture (answer in number)?\n"
                                            +"*.......*\n"
                                            +".*.....*.\n"
                                            +"..*...*..\n"
                                            +"...*.*...\n"
                                            +"....*....\n"
                                            ,"36");
        
        Questions question19 = new Questions("How many differnet type of symbol (@,#,$,...) in the picture (answer in number)?\n"
                                            +"@@#$%\n"
                                            +";##;:\n"
                                            +".*%%*\n"
                                            ,"8");
        
        Questions question20 = new Questions("How many . in the picture (answer in number)?\n"
                                            +":::::::::\n"
                                            +"....:....\n"
                                            +"....:....\n"
                                            +"....:....\n"
                                            +":::::::::\n"
                                            ,"66");
        
        Questions question21 = new Questions("How many . and $ in total in the picture (answer in number)?\n"
                                            +"*#$&.&$#*\n"
                                            +"**.....**\n"
                                            +"*.*...*.*\n"
                                            +"*..*.*..*\n"
                                            +"*...*...*\n"
                                            ,"24");
                                 
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
