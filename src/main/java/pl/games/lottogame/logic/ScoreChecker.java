package pl.games.lottogame.logic;

public class ScoreChecker {
    private NumberContainChecker check;
    private int score;

    public ScoreChecker() {
    }

    public int compareAndGetScore(int[] playerNumbers, int[] lotteryNumbers) {
        for (int i = 0; i < playerNumbers.length; i++) {
            for (int luckyNumber : lotteryNumbers) {
                if (playerNumbers[i] == luckyNumber) {
                    score++;
                }
            }
        }
        return this.score;
    }


}
