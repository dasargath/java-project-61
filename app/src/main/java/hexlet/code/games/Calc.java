package hexlet.code.games;

import hexlet.code.Misc;
import hexlet.code.Engine;

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
    public static void launchGame() {
        String task = "What is the result of the expression?";
        String[][] dataSourceAndUserInput = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            String calcSign = CALC_SIGN[Misc.getRandomNumber(CALC_SIGN.length)];
            int randomFigOne = Misc.getRandomNumber();
            int randomFigTwo = Misc.getRandomNumber();
            String calcOutput = getCalcOutput(calcSign, randomFigOne, randomFigTwo);
            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = randomFigOne + " " + calcSign + " " + randomFigTwo;
            dataSourceAndUserInput[userTries][Engine.INPUT] = calcOutput;
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }
}

