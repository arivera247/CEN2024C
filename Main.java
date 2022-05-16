package COP_2800C_12995_Alex_Rivera;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What game would you like to play? [Type # 1 or 2]");
        System.out.println("Guess [1]");
        System.out.println("Matador [2]");
        System.out.println("Enter number:");
        Scanner gameSelect = new Scanner(System.in);

        if(gameSelect.nextInt() == 1)
        {
            System.out.println("Time to play Guess!");
            Guess newGame = new Guess();
        }

        if(gameSelect.nextInt() == 2)
        {
            System.out.println("Time to play Matador!");
            Matador newGame = new Matador();
        }

        if((gameSelect.nextInt() != 1) || (gameSelect.nextInt() != 2) )
        {
            System.out.println("Invalid entry");
        }

    }
}
