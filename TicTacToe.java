/*
NAME: Larry Le
DATE:3/15/2021
PURPOSE: Main file for a tic tac toe program.

*/

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner playerChoice = new Scanner(System.in);

        // Multidimensional Array to be the Tic-Tac-Toe Board. It is a 3x3 grid.
        char[][] gameboard = new char[3][3];
        int capacity = gameboard.length;

        // Do While Loop to setup game rounds between player and computer.
        boolean end = false;

        do{

            int currentRound = 0;

            // Player's turn.
            

            //If statements to check any win conditions for the Player.
            //If statement to check digaonal winnings.
            if(gameboard){

            }

            //If statement to check horizontal winnings.
            if(gameboard){

            }

            //If statement to check horizontal winnings.
            if(gameboard){

            }

            // If statement to check for Tie condition.
            if (currentRound == capacity - 1){

                System.out.println("Tie!");
                end = true;

            };

            // Computer's turn.
            if(end != true){



            }


            // For Loop to check any win conditions for the Computer.
            for(int i = 0; i < capacity; i++){



            }


        }while(end == false);


        
    }

}
