package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
public class Progression {

    public static final int MIN_LEN = 5;
    public static final int MAX_LEN = 10;
    public static final int MIN_DIFF = 1;
    public static final int MAX_DIFF = 11;
    public static final int MIN_START = 5;
    public static final int MAX_START = 10;

    private static String[] generateRoundData() {
        int progressionLength = RandomUtils.getRandomNumber(MIN_LEN, MAX_LEN);
        int progressionStart = RandomUtils.getRandomNumber(MIN_START, MAX_START);
        int progressionDifference = RandomUtils.getRandomNumber(MIN_DIFF, MAX_DIFF);
        int hiddenIndex = (int) (Math.random() * (progressionLength - 1));
        int[] getProgression = generateProgression(progressionLength, progressionDifference, progressionStart);

        StringBuilder question = new StringBuilder();
        for (int i = 0; i < progressionLength; i++) {
            if (i == hiddenIndex) {
                question.append(".. ");
            } else {
                question.append(getProgression[i]).append(" ");
            }
        }
        return new String[] {String.valueOf(question), Integer.toString(getProgression[hiddenIndex])};
    }

    static int[] generateProgression(int progressionLength, int progressionStart, int progressionStep) {
        int[] progression = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = progressionStart + i * progressionStep;
        }
        return progression;
    }

    public static void launchGame() {

        String gameTask = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.ROUNDS_LIMIT][Engine.ROUNDS_LIMIT];

        int correctAnswersCount = 0;
        while (correctAnswersCount < Engine.ROUNDS_LIMIT) {
            String[] roundData = generateRoundData();
            gameData[correctAnswersCount][Engine.TASK_NUMBER] = roundData[0];
            gameData[correctAnswersCount][Engine.INPUT] = roundData[1];
            correctAnswersCount += 1;
        }
        Engine.gameEngine(gameData, gameTask);
    }
}
