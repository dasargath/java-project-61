package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void launchGame() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] dataSourceAndUserInput = Engine.prepareDataSourceAndUserInput(task);

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            int randomFig = Engine.getRandomNumber();
            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = Integer.toString(randomFig);
            dataSourceAndUserInput[userTries][Engine.INPUT] = (isPrime(randomFig)) ? "yes" : "no";
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }
    public static boolean isPrime(int figure) {
        boolean prime = true;
        if (figure <= 1) {
            prime = false;
        } else {
            for (int number = 2; number < figure; number++) {
                if (figure % number == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
