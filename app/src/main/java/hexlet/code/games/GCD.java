package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void launchGame() {

        String task = "Find the greatest common divisor of given numbers.";
        String[][] dataSourceAndUserInput = Engine.prepareDataSourceAndUserInput(task);

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            int randomFigOne = Engine.getRandomNumber();
            int randomFigTwo = Engine.getRandomNumber();

            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = randomFigOne + " " + randomFigTwo;
            dataSourceAndUserInput[userTries][Engine.INPUT] = Integer.toString(getGcd(randomFigOne, randomFigTwo));
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }

    public static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGcd(secondNumber, firstNumber % secondNumber);
    }
}
