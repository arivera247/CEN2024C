package COP_2800C_12995_Alex_Rivera;

import java.util.Scanner;

public class Guess {

    private int playerGuess;
    private int rollOne;
    private int rollTwo;
    private int rollThree;

    public Guess()
    {
        System.out.println("Choose a number between 2 and 12.");
        System.out.println("Two dice will be rolled and added together.");
        System.out.println("You will have 3 chances to win.");

        Die newRollOneDieOne = new Die();
        Die newRollOneDieTwo = new Die();

        rollOne = newRollOneDieOne.getRoll() + newRollOneDieTwo.getRoll();

        Die newRollTwoDieOne = new Die();
        Die newRollTwoDieTwo = new Die();

        rollTwo = newRollTwoDieOne.getRoll() + newRollTwoDieTwo.getRoll();

        Die newRollThreeDieOne = new Die();
        Die newRollThreeDieTwo = new Die();

        rollThree = newRollThreeDieOne.getRoll() + newRollThreeDieTwo.getRoll();

        System.out.println("Enter number:");
        Scanner gameSelect = new Scanner(System.in);
        playerGuess = gameSelect.nextInt();
        System.out.println("Player guess:" + playerGuess);
        System.out.println("Lets roll!");
        System.out.println("The first roll is... " + rollOne);
        System.out.println("The second roll is... " + rollTwo);
        System.out.println("The third roll is... " + rollThree);

        if((playerGuess == rollOne) || (playerGuess == rollTwo) || (playerGuess == rollThree))
        {
            System.out.println("You win!");
        }
        else{
                System.out.println("Better luck next time...");
    }

    }

}
