package COP_2800C_12995_Alex_Rivera;

import java.util.Scanner;
import java.util.Random;

public class Matador {

    private int playerPoints = 0;
    private int opponentPoints = 0;

    private int playerRollOne;
    private int playerRollTwo;

    private int opponentRollOne;
    private int opponentRollTwo;

    private int playerGuess;
    private int opponentGuess;

    public Matador() {
        System.out.println("The rules are simple...");
        System.out.println("Each player chooses a number between 2 and 6 then rolls a die twice");
        System.out.println("The first one to 99 points wins!");
        System.out.println("P.S. Careful with the horns!!!");

        do {
            System.out.println("Player choose your number:");
            Scanner gameSelect = new Scanner(System.in);
            playerGuess = gameSelect.nextInt();
            System.out.println("Player chose:" + playerGuess);
            System.out.println("Opponent choose your number:");
            Random newGuess = new Random();
            opponentGuess = newGuess.nextInt(5) + 2;
            System.out.println("Opponent chose:" + opponentGuess);

            Die newPlayerRollDieOne = new Die();
            Die newPlayerRollDieTwo = new Die();

            Die newOpponentRollDieOne = new Die();
            Die newOpponentRollDieTwo = new Die();

            playerRollOne = newPlayerRollDieOne.getRoll();
            playerRollTwo = newPlayerRollDieTwo.getRoll();

            opponentRollOne = newOpponentRollDieOne.getRoll();
            opponentRollTwo = newOpponentRollDieTwo.getRoll();

            if((playerRollOne == 1) && (playerRollTwo == 1))
            {
                System.out.println("Player roll 1: " + playerRollOne + " Player roll 2: " + playerRollTwo);
                System.out.println("Player got the horns!");
                System.out.println("This player loses their turn and 25 points!");
                playerPoints -= 25;
                System.out.println("Total player points: " + playerPoints);
            }
            else if((opponentRollOne == 1) && (opponentRollTwo == 1))
            {
                    System.out.println("Roll 1: " + opponentRollOne + " Roll 2: " + opponentRollTwo);
                    System.out.println("Opponent got the horns!");
                    System.out.println("This opponent loses their turn and 25 points!");
                    opponentPoints -= 25;
                    System.out.println("Total opponent points: " + opponentPoints);
            }
            else if((playerRollOne == 1) || (playerRollTwo == 1))
            {
                System.out.println("Player roll 1: " + playerRollOne + " Player roll 2: " + playerRollTwo);
                System.out.println("Player got one horn...no points lost but no points gained.");
                System.out.println("Total player points: " + playerPoints);
                System.out.println("Next turn...");
            }
            else if((opponentRollOne == 1) || (opponentRollTwo == 1))
            {
                System.out.println("Opponent roll 1: " + opponentRollOne + " Opponent roll 2: " + opponentRollTwo);
                System.out.println("Opponent got one horn...no points lost but no points gained.");
                System.out.println("Total opponent points: " + opponentPoints);
                System.out.println("Next turn...");
            }
            else if ((playerRollOne > 1) || (playerRollTwo > 1))
            {
                System.out.println("Player roll 1: " + playerRollOne + " Player roll 2: " + playerRollTwo);
                System.out.println("No horns here! Player gets points!");
                playerPoints = playerPoints + playerRollOne + playerRollTwo;
                System.out.println("Total player points: " + playerPoints);
            }
            else if ((opponentRollOne > 1) || (opponentRollTwo > 1))
            {
                System.out.println("Opponent roll 1: " + opponentRollOne + " Opponent roll 2: " + opponentRollTwo);
                System.out.println("No horns here! Opponent gets points!");
                opponentPoints = opponentPoints + opponentRollOne + opponentRollTwo;
                System.out.println("Total opponent points: " + opponentPoints);
            }
            else if ((playerRollOne == playerGuess) || (playerRollTwo == playerGuess))
            {
                System.out.println("Player guessed it right and goes again!");
                opponentRollOne = 0;
                opponentRollTwo = 0;
            }
            else if ((opponentRollOne == opponentGuess) || (opponentRollTwo == opponentGuess))
            {
                System.out.println("Opponent guessed it right and goes again!");
                playerRollOne = 0;
                playerRollTwo = 0;
            }

        }
        while (playerPoints <= 99);


        if (playerPoints >= 99)
        {
            System.out.println("Player wins with " + playerPoints + " points!");
        }
        else if (opponentPoints >= 99)
        {
            System.out.println("Opponent wins with " + opponentPoints + " points!");
        }
        else
        {
            System.out.println("Its a tie!");
        }
    }
}