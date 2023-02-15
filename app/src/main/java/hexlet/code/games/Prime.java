package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {

    private static String[] generateRoundData(int randomFig) {
        String task = Integer.toString(randomFig);
        String answer = (isPrime(randomFig))  ? "yes" : "no";
        return  new String[] {task, answer};
    }

    public static void launchGame() {
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            int randomFig = RandomUtils.getRandomNumber();
            String[] roundData = generateRoundData(randomFig);
            gameData[userTries][Engine.TASK_NUMBER] = roundData[0];
            gameData[userTries][Engine.INPUT] = roundData[1];
            userTries += 1;
        }
        Engine.gameEngine(gameData, gameTask);
    }
    public static boolean isPrime(int figure) {
        if (figure <= 1) {
            return false;
        }
        for (int number = 2; number < figure; number++) {
            if (figure % number == 0) {
                return false;
            }
        }
        return true;
    }
}
