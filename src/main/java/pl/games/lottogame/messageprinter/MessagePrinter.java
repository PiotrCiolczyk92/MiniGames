package pl.games.lottogame.messageprinter;

import pl.games.lottogame.numberreciver.PlayerNumbersReceiver;
import pl.games.lottogame.numberreciver.RandomNumbersReceiver;

public class MessagePrinter {
    RandomNumbersReceiver randomNumbersReceiver;
    PlayerNumbersReceiver playerNumbersReceiver;

    public MessagePrinter() {}

    public void pickOutOfRange() {
        System.out.println("Pick again number in range 1 to 99");
    }

    public void numberAlreadyChosen() {
        System.out.println("Number already chosen!");
    }

    public void lotteryNumbersPrinter() {
        System.out.println("Our lucky drawn numbers are: \n");
        for (int number : this.randomNumbersReceiver.getDrawnNumbers()) {
            System.out.print(number + " ");
        }
    }

    public void playerNumberPrinter() {
        System.out.println("Player chosen numbers are: \n");
        for (int number : this.playerNumbersReceiver.getPlayerNumbers()) {
            System.out.print(number + " ");
        }
    }



}
