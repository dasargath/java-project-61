package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCD {

    private static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGcd(secondNumber, firstNumber % secondNumber);
    }

    private static String[] generateRoundData() {
        int randomFigOne = RandomUtils.getRandomNumber();
        int randomFigTwo = RandomUtils.getRandomNumber();
        int gcd = getGcd(randomFigOne, randomFigTwo);

        return new String[] {randomFigOne + " " + randomFigTwo, Integer.toString(gcd)};
    }

    public static void launchGame() {

        String gameTask = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        for (int usrTries = 0; usrTries < Engine.ROUNDS_LIMIT; usrTries++) {
            gameData[usrTries] = generateRoundData();
        }
        Engine.gameEngine(gameData, gameTask);
    }
}
