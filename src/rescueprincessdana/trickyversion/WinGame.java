
package rescueprincessdana.trickyversion;

import java.util.Random;
import static rescueprincessdana.UserInterface.printWithSymbolBox;


/**
 *
 * @author vinhxu
 */
public class WinGame {
    public static void check(int code1, int code2, int code3){
        int code = code1+code2+code3;
        if(code1!=code2&&code1!=code3&&code2!=code3&&code==6){
            printWithSymbolBox("Congratulation Prince! The only CHALLENGE left is to please Priness DANA with a HUGE WEDDING!!!","*");
            printWithSymbolBox("THE END","*");
        }else{
            Random random = new Random();
            int choice = random.nextInt(6)+1;
            switch(choice){
                case 1: 
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. There must Be something missing here!",".");
                    break;
                case 2:
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. This is the reAl chaLlenge!",".");
                    break;
                case 3:
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. How to win her heArt?",".");
                    break;
                case 4:
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. You woNder why?",".");
                    break;
                case 5:
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. What Can you do now?",".");
                    break;
                case 6:
                    printWithSymbolBox("Princess DANA refuse to marry you, Prince. This is thE end!",".");
                    break;
            }
                    
        }
    }

    
}
