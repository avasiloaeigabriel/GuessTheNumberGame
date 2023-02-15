package GuessTheNumberGame;

import java.util.Scanner;


public class GameLauncher {
    public static void main(String[] args) {

        boolean player1Answer = false;
        boolean player2Answer = false;
        boolean player3Answer = false;


        Scanner scanner = new Scanner(System.in);
        GuessGame guessGame = new GuessGame();
        guessGame.setMinNumber(0);
        guessGame.setMaxNumber(5);
        Player player = new Player();
        player.NumberOfPlayers(3);
        System.out.println("The number of players is: " + player.getNumberOfPlayers());
        System.out.println("Please insert the number for Player1:\nThe number must be between " + guessGame.getMinNumber() + " and " + guessGame.getMaxNumber());
        player.player1Choice(scanner.nextInt());
        System.out.println("Please insert the number for Player2:\nThe number must be between " + guessGame.getMinNumber() + " and " + guessGame.getMaxNumber());
        player.player2Choice(scanner.nextInt());
        System.out.println("Please insert the number for Player3:\nThe number must be between " + guessGame.getMinNumber() + " and " + guessGame.getMaxNumber());
        player.player3Choice(scanner.nextInt());
        System.out.println("The given random number is: " + guessGame.getRandomNumber(guessGame.getMinNumber(), guessGame.getMaxNumber()));
        System.out.printf("Player1 chose number \"%d\"", player.getPlayer1Choice()).println();
        System.out.printf("Player2 chose number \"%d\"", player.getPlayer2Choice()).println();
        System.out.printf("Player3 chose number \"%d\"", player.getPlayer3Choice()).println();
        if (player.getPlayer1Choice() == guessGame.getRandomNumber()) {
            System.out.println("Player1 guessed the number!");
            player1Answer = true;
        } else {
            System.out.println("Player1 didn't guessed the number");
        }

        if (player.getPlayer2Choice() == guessGame.getRandomNumber()) {
            System.out.println("Player2 guessed the number!");
            player2Answer = true;
        } else {
            System.out.println("Player2 didn't guessed the number");
        }

        if (player.getPlayer3Choice() == guessGame.getRandomNumber()) {
            System.out.println("Player3 guessed the number!");
            player3Answer = true;

        } else {
            System.out.println("Player3 didn't guessed the number");
        }
        if (player1Answer == true) {
            System.out.println("The winner is Player1!");
        } else if (player2Answer == true) {
            System.out.println("The winner is Player2!");

        } else if (player3Answer == true) {
            System.out.println("The winner is Player3!");

        }

    }
}
