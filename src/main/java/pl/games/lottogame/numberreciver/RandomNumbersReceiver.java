package pl.games.lottogame.numberreciver;

import pl.games.lottogame.logic.NumberContainChecker;

import java.util.Random;

public class RandomNumbersReceiver {
    private final Random random = new Random();
    private static final int SIX_NUMBERS_TO_DRAW = 6;
    private final int[] lotteryNumbers;
    private int machineDraw;
    private final NumberContainChecker check;

    public RandomNumbersReceiver() {
        this.check = new NumberContainChecker();
        lotteryNumbers = new int[SIX_NUMBERS_TO_DRAW];
        drawSixRandomNumbers();
    }

    public int[] getDrawnNumbers() {
        return lotteryNumbers;
    }

    public int[] drawSixRandomNumbers() {
        machineDraw = random.nextInt(99 - 1) + 1;
        for (int i = 0; i < SIX_NUMBERS_TO_DRAW; i++) {
            machineDraw = random.nextInt(99 - 1) + 1;
            if(!check.isNumberContainIn(machineDraw, lotteryNumbers)) {
                this.lotteryNumbers[i] = machineDraw;
            } else {
                do {
                    machineDraw = random.nextInt(99 - 1) + 1;
                } while (check.isNumberContainIn(machineDraw, lotteryNumbers));
            }
        }
        return this.lotteryNumbers;
    }

}
