package pl.games.lottogame.gameinitializer;

import pl.games.gamelogic.Game;
import pl.games.lottogame.messageprinter.MessagePrinter;
import pl.games.lottogame.numberreciver.PlayerNumbersReceiver;
import pl.games.lottogame.numberreciver.RandomNumbersReceiver;

public class LotteryGame implements Game {
    PlayerNumbersReceiver playerNumbersReceiver;
    RandomNumbersReceiver randomNumbersReceiver;
    MessagePrinter messagePrinter;

    LotteryGame() {
    }

    public void play() {

    }
}
