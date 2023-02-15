package GuessTheNumberGame;

public class GuessGame {
    int minNumber;
    int maxNumber;

    private int randomNumber;

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber(int minNumber, int maxNumber) {

        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.randomNumber = (int) (Math.random() * (maxNumber - minNumber)) + minNumber;
        return randomNumber;
    }


}


