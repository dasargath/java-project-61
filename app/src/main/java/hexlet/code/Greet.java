package hexlet.code;

import java.util.Scanner;

public class Greet {

    public static String inputName;
    public static void userGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        inputName =  new Scanner(System.in).nextLine();
        System.out.println("Hello, " + inputName + "!");
    }
}
