package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static void launchGame() {

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] dataSourceAndUserInput = Engine.prepareDataSourceAndUserInput(task);

        int userTries = 0;
        while (userTries < Engine.ROUNDS_LIMIT) {
            int randomFig = Engine.getRandomNumber();
            dataSourceAndUserInput[userTries][Engine.TASK_NUMBER] = Integer.toString(randomFig);
            dataSourceAndUserInput[userTries][Engine.INPUT] = (randomFig % 2 == 0) ? "yes" : "no";
            userTries += 1;
        }
        Engine.gameEngine(dataSourceAndUserInput, task);
    }
}
