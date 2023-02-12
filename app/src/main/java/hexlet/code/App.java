package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner usrGameChoice = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            String choice = usrGameChoice.nextLine();
            System.out.println("Your choice: " + choice + "\n");

            switch (choice) {
                case "1" -> Greet.userGreeting();
                case "2" -> Even.launchGame();
                case "3" -> Calc.launchGame();
                case "4" -> GCD.launchGame();
                case "5" -> Progression.launchGame();
                case "6" -> Prime.launchGame();
                case "0" -> {
                    System.out.println("Exiting application.");
                    usrGameChoice.close();
                    return;
                }
                default -> System.out.println("Select numbers from 0 to 6");
            }
        }
    }
}
