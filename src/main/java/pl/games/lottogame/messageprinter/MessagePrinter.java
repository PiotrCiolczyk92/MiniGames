package pl.games.lottogame.messageprinter;

public class MessagePrinter {
    private final int MAX_SCORE = 6;

    public MessagePrinter() {

    }

    public void pickOutOfRange() {
        System.out.println("Pick again number in range 1 to 99");
    }

    public void numberAlreadyChosen() {
        System.out.println("Number already chosen!");
    }

    public void playerStartToPickMessage() {
        System.out.println("Please pick 6 different numbers from range 1 to 99");
    }

    public void luckyNumbersAnnouncement() {
        System.out.println("...and the lucky numbers are: ");
    }

    public void playerScoreAnnouncement() {
        System.out.println("Your score is: ");
    }

    public void playerNumbersIntroduction() {
        System.out.println("Your numbers are: ");
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public void gameResultMessage(int playerScore) {
        if (playerScore == MAX_SCORE) {
            System.out.println("Congratulations! You hit jackpot!");
        } else {
            System.out.println("Maybe next time... Bye!");
        }
    }


}
