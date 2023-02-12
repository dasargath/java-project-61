package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Engine {

    //common constants for usage across different classes
    public static final int ROUNDS_LIMIT = 3;
    public static final int TASK_NUMBER = 0;
    public static final int INPUT = 1;
    public static final int MAX_RAND_BOUND = 100;
    public static final int MIN_RAND_BOUND = 1;

    //randomizer methods for usage in different cases in different classes
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MIN_RAND_BOUND, MAX_RAND_BOUND);
    }
    public static int getRandomNumber(int lastBound) {
        Random random = new Random();
        return random.nextInt(MIN_RAND_BOUND,  lastBound - 1);
    }
    public static int getRandomNumber(int startBound, int lastBound) {
        Random random = new Random();
        return random.nextInt((lastBound - startBound) + 1) + startBound;
    }

    // common method used to set initial data array
    public static String[][] prepareDataSourceAndUserInput(String task) {
        String[][] dataSourceAndUserInput = new String[ROUNDS_LIMIT][ROUNDS_LIMIT];
        return dataSourceAndUserInput;
    }

    // program body for analysing input user data and outputting it to console
    public static void gameEngine(String[][] dataSourceAndUserInput, String task) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + inputName + "!");
        System.out.println(task);

        int userTries = 0;
        int counterCorrect = 0;
        while (userTries < ROUNDS_LIMIT) {
            System.out.println("Question: " + dataSourceAndUserInput[userTries][TASK_NUMBER]);
            Scanner listenUsrChoice = new Scanner(System.in);
            String usrChoice = listenUsrChoice.nextLine().toLowerCase();
            System.out.println("Your answer: " + usrChoice);

            if (usrChoice.equals(dataSourceAndUserInput[userTries][Engine.INPUT])) {
                counterCorrect += 1;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usrChoice + "'"  + " is wrong answer ;(. Correct answer was " + "'"
                        + dataSourceAndUserInput[userTries][INPUT] + "'.");
                System.out.println("Let's try again, " + inputName + "!" + "\n");
                break;
            }
            userTries += 1;
        }
        if (counterCorrect == ROUNDS_LIMIT) {
            System.out.println("Congratulations, " + inputName + "!" + "\n");
        }
    }
}


