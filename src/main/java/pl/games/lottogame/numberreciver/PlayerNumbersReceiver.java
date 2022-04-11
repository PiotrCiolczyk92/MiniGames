package pl.games.lottogame.numberreciver;

import pl.games.lottogame.logic.NumberContainChecker;
import pl.games.lottogame.logic.RangeChecker;
import pl.games.lottogame.messageprinter.MessagePrinter;

import java.util.Scanner;

public class PlayerNumbersReceiver {
    private final Scanner scanner = new Scanner(System.in);
    private static final int SIX_NUMBERS_TO_PICK = 6;
    private final int[] playerNumbers;
    private final MessagePrinter message;
    private final NumberContainChecker check;

    public PlayerNumbersReceiver() {
        this.playerNumbers = new int[SIX_NUMBERS_TO_PICK];
        this.message = new MessagePrinter();
        RangeChecker rangeCheck = new RangeChecker();
        this.check = new NumberContainChecker();
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public void receiveSixNumbersFromPlayer() {
        for (int i = 0; i < SIX_NUMBERS_TO_PICK; ) {
            int playerInput;
            playerInput = scanner.nextInt();
            if (check.isNumberContainIn(playerInput, playerNumbers)) {
                message.numberAlreadyChosen();
            } else if (!RangeChecker.isInLotteryGameNumbersRange(playerInput)) {
                message.pickOutOfRange();
            } else {
                this.playerNumbers[i] += playerInput;
                i++;
            }
        }
        scanner.close();
    }

}
