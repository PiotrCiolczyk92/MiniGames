package pl.games.lottogame.logic;

public class RangeChecker {

    public RangeChecker() {}

    public static boolean isInLotteryGameNumbersRange(int number) {
        return number >= 1 && number <= 99;
    }
}
