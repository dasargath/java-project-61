package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calc {
    private static final String[] CALC_SIGN = {"*", "-", "+"};

    private static String getCalcOutput(String calcSign, int randomFigOne, int randomFigTwo) {
        switch (calcSign) {
            case "*" -> {
                return Integer.toString(randomFigOne * randomFigTwo);
            }
            case "-" -> {
                return Integer.toString(randomFigOne - randomFigTwo);
            }
            case "+" -> {
                return Integer.toString(randomFigOne + randomFigTwo);
            }
            default -> {
                return "Wrong input data";
            }
        }
    }

    private static String[] generateRoundData() {
        String calcSign = CALC_SIGN[RandomUtils.getRandomNumber(CALC_SIGN.length)];
        int randomFigOne = RandomUtils.getRandomNumber();
        int randomFigTwo = RandomUtils.getRandomNumber();
        String newTask = randomFigOne + " " + calcSign + " " + randomFigTwo;
        String usrAnswer = getCalcOutput(calcSign, randomFigOne, randomFigTwo);
        return new String[] {newTask, usrAnswer};
    }

    public static void launchGame() {
        String gameTask = "What is the result of the expression?";
        String[][] gameData = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        for (int usrTries = 0; usrTries < Engine.ROUNDS_LIMIT; usrTries++) {
            String[] roundData = generateRoundData();
            gameData[usrTries][Engine.TASK_NUMBER] = roundData[0];
            gameData[usrTries][Engine.INPUT] = roundData[1];
        }
        Engine.gameEngine(gameData, gameTask);
    }
}

