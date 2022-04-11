package pl.games.lottogame.logic;

public class NumberContainChecker {

    public NumberContainChecker() {
    }

    public boolean isNumberContainIn(int number, int[] numbers) {
        for (int checkedNumber : numbers) {
            if (number == checkedNumber) {
                return true;
            }
        }
        return false;
    }


}
