/*
  Copyright © FanFreak247  All rights reserved.
  Permission granted to reproduce for personal and educational use only. Commercial copying, hiring, lending is prohibited.
  May be used free of charge. Selling without prior written consent prohibited. Obtain permission before redistributing. In all cases this notice must remain intact.
*/

import java.util.Scanner;
public class TicTacToe
{
    char board[][] =
    {
        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '}
    };
    char pos = ' ';
    int x = 1, y = 1;
    Scanner s;
    TicTacToe()
    {
        s = new Scanner(System.in);
    }

    void position(boolean first)
    {
        pos = first? 'X':'O';
        if (pos == 'X') System.out.println("Player 1's Turn");
        else System.out.println("Player 2's Turn.");
        while (true)
        {
            x = Integer.parseInt(s.nextLine());
            y = Integer.parseInt(s.nextLine());
            try
            {
                if (board[x-1][y-1] == ' ') {
                    board[x-1][y-1] = pos;
                    break;
                }
                else
                {
                    System.out.println("Something is already there. Try again.");
                }
            }
            catch (Exception e)
            {
                System.out.println("There was an error. Please try again.");
            }
        }
    }
    void printBoard()
    {
        for (int a = 0; a < 3; a++)
        {
            for (int b = 0; b < 3; b++)
            {
                System.out.print("| " + board[a][b] + " |");
            }
            System.out.println("\n");
        }
    }
    boolean checkTie() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (board[a][b] == ' ') return false;
            }
        }
        return true;
    }
    int checkWin()
    {
        //checkForTwo checks for 3 in a row.
        short checkForTwo = 0;
        //Row
        for (int col = 1; col < 3; col++)
        {
            if (board[x-1][col]==board[x-1][col-1] && board[x-1][col] != ' ') checkForTwo++;
            if (checkForTwo==2) return board[x-1][col] == 'X'? 1:2;
        }
        //Sideways
        checkForTwo=0;
        for (int row = 1; row < 3; row++)
        {
            if (board[row][y-1]==board[row-1][y-1] && board[row][y-1] != ' ') checkForTwo++;
            if (checkForTwo==2) return board[row][y-1] == 'X'? 1:2;
        }
        checkForTwo=0;
        //Diagonals to the Right
        for (int a = 1; a < 3; a++)
        {
            if (board[a][a]==board[a-1][a-1]&&board[a][a]!=' ') checkForTwo++;
            if (checkForTwo==2) return board[a][a]=='X'? 1:2;
        }
        //Diagonal to the Left
        if (board[0][2]==board[1][1] && board[0][2] == board[2][0] && board[0][2]!= ' ') return board[0][2]=='X'? 1:2;
        return 0;
    }

}
