package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_LIMIT = 3;
    public static final int TASK_NUMBER = 0;
    public static final int INPUT = 1;
    public static void gameEngine(String[][] gameData, String gameTask) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + inputName + "!");
        System.out.println(gameTask);

        for (int i = 0; i < ROUNDS_LIMIT; i++) {
            System.out.println("Question: " + gameData[i][TASK_NUMBER]);
            Scanner listenUsrChoice = new Scanner(System.in);
            String usrChoice = listenUsrChoice.nextLine().toLowerCase();
            System.out.println("Your answer: " + usrChoice);

            if (!usrChoice.equals(gameData[i][Engine.INPUT])) {
                System.out.println("'" + usrChoice + "'"  + " is wrong answer ;(. Correct answer was " + "'"
                        + gameData[i][INPUT] + "'.");
                System.out.println("Let's try again, " + inputName + "!" + "\n");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + inputName + "!" + "\n");
    }
}


