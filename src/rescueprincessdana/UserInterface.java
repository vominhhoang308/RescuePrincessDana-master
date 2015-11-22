/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescueprincessdana;

import java.util.Scanner;

/**
 *
 * @author vinhxu
 */
public class UserInterface {

    private Scanner scanner;
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public String string() {
        String string = this.scanner.nextLine();
        return string;
    }

    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void printWithSymbolBox(String string, String symbol) {
        for (int i = 0; i < (string.length() + 2); i++) {
            print(symbol);
        }
        println("");
        print(symbol + string + symbol);
        println("");
        for (int i = 0; i < (string.length() + 2); i++) {
            print(symbol);
        }
        println("");
    }

    public static void enterToContinue(UserInterface userInterface) {
        println("");
        print(UserInterface.RED+"Press \"Enter\" to continue"+UserInterface.RESET);
        userInterface.string();
        println("");
    }

    public static void printTrickyVersionMessage(UserInterface userInterface) {
        String welcomeMessage = "WELCOME TO Tricky Version of \"RESCUE PRINCESS DANA\"";
        String gameDescription = "Princess DANA is now captured in an castle.\n"
                + "To recuse her, you need to overcome 3 gates.\n"
                + "It is that SIMPLE, isn't it?";
        printWithSymbolBox(welcomeMessage, "*");
        enterToContinue(userInterface);
        println(gameDescription);
        enterToContinue(userInterface);
    }

    public static void printNormalVersionMessage(UserInterface userInterface) {
        String welcomeMessage = "WELCOME TO Normal Version of \"RESCUE PRINCESS DANA\"";
        String gameDescription = "Princess DANA is now captured in an gang's boat.\n"
                + "To recuse her, you just follow the story flow.\n"
                + "It is that SIMPLE, isn't it?";
        printWithSymbolBox(welcomeMessage, "*");
        enterToContinue(userInterface);
        println(gameDescription);
        enterToContinue(userInterface);
    }
}
