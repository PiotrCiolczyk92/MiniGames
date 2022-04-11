package pl.games.lottogame.gameinitializer;

import pl.games.gameinterface.Game;
import pl.games.lottogame.logic.ScoreChecker;
import pl.games.lottogame.messageprinter.MessagePrinter;
import pl.games.lottogame.numberreciver.PlayerNumbersReceiver;
import pl.games.lottogame.numberreciver.RandomNumbersReceiver;

public class LotteryGame implements Game {
    PlayerNumbersReceiver playerNumbers;
    RandomNumbersReceiver lotteryNumbers;
    ScoreChecker scoreChecker;
    MessagePrinter printer;
    private int playerScore;

    public LotteryGame() {
        this.lotteryNumbers = new RandomNumbersReceiver();
        this.playerNumbers = new PlayerNumbersReceiver();
        this.scoreChecker = new ScoreChecker();
        this.printer = new MessagePrinter();
    }

    public void play() {
        printer.playerStartToPickMessage();
        playerNumbers.receiveSixNumbersFromPlayer();
        printer.luckyNumbersAnnouncement();
        printer.printNumbers(lotteryNumbers.getDrawnNumbers());
        printer.playerNumbersIntroduction();
        printer.printNumbers(playerNumbers.getPlayerNumbers());
        printer.playerScoreAnnouncement();
        playerScore = scoreChecker.compareAndGetScore
                (lotteryNumbers.getDrawnNumbers(), playerNumbers.getPlayerNumbers());
        System.out.println(playerScore);
        printer.gameResultMessage(playerScore);

    }
}
