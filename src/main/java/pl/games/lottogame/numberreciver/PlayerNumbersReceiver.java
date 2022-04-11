package pl.games.lottogame.numberreciver;

import pl.games.lottogame.messageprinter.MessagePrinter;

import java.util.Scanner;

public class PlayerNumbersReceiver {
    private static final Scanner scanner = new Scanner(System.in);
    private static MessagePrinter messagePrinter;
    private static final int SIX_NUMBERS_TO_PICK = 6;
    private static final int[] playerNumbers = new int[SIX_NUMBERS_TO_PICK];
    private static int playerInput;

    public PlayerNumbersReceiver() {
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public static int[] receiveSixNumbersFromPlayer() {
        for (int i = 0; i < SIX_NUMBERS_TO_PICK; ) {
            do {
                playerInput = scanner.nextInt();
                if (isAlreadyChosen(playerInput)) {
                    messagePrinter.numberAlreadyChosen();
                }
            } while (isAlreadyChosen(playerInput));
            if (isInRange(playerInput)) {
                playerNumbers[i] += playerInput;
                i++;
            } else
                messagePrinter.pickOutOfRange();
        }
        scanner.close();
        return playerNumbers;
    }

    public static boolean isInRange(int inputNumber) {
        return inputNumber >= 1 && inputNumber <= 99;
    }

    public static boolean isAlreadyChosen(int inputNumber) {
        for (int number : playerNumbers) {
            if (inputNumber == number) {
                return true;
            } else if (number == 0) {
                return false;
            }
        }
        return false;
    }

}
