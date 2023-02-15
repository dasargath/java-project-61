package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
public class Even {

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    private static String[] generateRoundData(int number) {
        String[] roundData = new String[2];
        roundData[Engine.TASK_NUMBER] = Integer.toString(number);
        roundData[Engine.INPUT] = isEven(number) ? "yes" : "no";
        return roundData;
    }

    public static void launchGame() {

        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        for (int usrTries = 0; usrTries < Engine.ROUNDS_LIMIT; usrTries++) {
            int randomFig = RandomUtils.getRandomNumber();
            gameData[usrTries] = generateRoundData(randomFig);
        }
        Engine.gameEngine(gameData, gameTask);
    }
}

