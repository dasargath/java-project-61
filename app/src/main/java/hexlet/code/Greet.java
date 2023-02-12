package hexlet.code;

import java.util.Scanner;

public class Greet {

    public static void userGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + inputName + "!");
    }
}
