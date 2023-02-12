package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String[] CALC_SIGN = {"*", "-", "+"};
    public static void launchGame() {

        String task = "What is the result of the expression?";
        String[][] dataSourceAndUserInput = Engine.prepareDataSourceAndUserInput(task);

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            String calcSign = CALC_SIGN[Engine.getRandomNumber(CALC_SIGN.length)];
            int randomFigOne = Engine.getRandomNumber();
            int randomFigTwo = Engine.getRandomNumber();

            String calcOutput = switch (calcSign) {
                case "*" -> Integer.toString(randomFigOne * randomFigTwo);
                case "-" -> Integer.toString(randomFigOne - randomFigTwo);
                case "+" -> Integer.toString(randomFigOne + randomFigTwo);
                default -> "Wrong input data";
            };
            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = randomFigOne + " " + calcSign + " " + randomFigTwo;
            dataSourceAndUserInput[userTries][Engine.INPUT] = calcOutput;
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }
}

