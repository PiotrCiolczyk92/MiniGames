package pl.games.lottogame.numberreciver;

import java.util.Random;

public class RandomNumbersReceiver {
    private final Random random = new Random();
    private static final int SIX_NUMBERS_TO_DRAW = 6;
    private static final int[] drawnNumbers = new int[SIX_NUMBERS_TO_DRAW];
    private static int machineDraw;

    public RandomNumbersReceiver() {
    }

    public int[] getDrawnNumbers() {
        return drawnNumbers;
    }

    public int[] drawSixRandomNumbers() {
        machineDraw = this.random.nextInt(99 - 1) + 1;
        for (int i = 0; i < SIX_NUMBERS_TO_DRAW; i++) {
            machineDraw = this.random.nextInt(99 - 1) + 1;
            if(!isAlreadyIn(machineDraw)) {
                drawnNumbers[i] = machineDraw;
            } else {
                do {
                    machineDraw = this.random.nextInt(99 - 1) + 1;
                } while (isAlreadyIn(machineDraw));
            }
        }
        return drawnNumbers;
    }

    public static boolean isAlreadyIn(int drawnNumber) {
        for (int number : drawnNumbers) {
            if (drawnNumber == number) {
                return true;
            }
        }
        return false;
    }



}
