package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Misc;
public class Even {

    private static String isEven(int number) {
        return (number % 2 == 0) ? "yes" : "no";

    }
    public static void launchGame() {

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] dataSourceAndUserInput = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            int randomFig = Misc.getRandomNumber();
            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = Integer.toString(randomFig);
            dataSourceAndUserInput[userTries][Engine.INPUT] = isEven(randomFig);
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }
}
