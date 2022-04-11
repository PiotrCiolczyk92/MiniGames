package pl.games.lottogame.logic;

import pl.games.lottogame.numberreciver.PlayerNumbersReceiver;
import pl.games.lottogame.numberreciver.RandomNumbersReceiver;

public class ScoreComparator {
    PlayerNumbersReceiver playerNumbers;
    RandomNumbersReceiver randomNumbers;
    private static int score;

    public ScoreComparator() {
    }

    public int getPlayerScore() {
        for (int playerNumber : playerNumbers.getPlayerNumbers()) {
            if (isLuckyDrawnNumbersContain(playerNumber)) {
                score++;
            }
        }
        return score;
    }

    public boolean isLuckyDrawnNumbersContain(int playerNumber) {
        for (int i = 0; i < randomNumbers.getDrawnNumbers().length; i++) {
            for (int number : playerNumbers.getPlayerNumbers()) {
                if (number == randomNumbers.drawSixRandomNumbers()[i]) {
                    return true;
                }
            }
        }
        return false;
    }


}
