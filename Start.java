/*
  Copyright © FanFreak247  All rights reserved.
  Permission granted to reproduce for personal and educational use only. Commercial copying, hiring, lending is prohibited.
  May be used free of charge. Selling without prior written consent prohibited. Obtain permission before redistributing. In all cases this notice must remain intact.
 */

import java.util.Scanner;
public class Start
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        System.out.println("Welcome to Tic Tac Toe");
        while (true)
        {
            game.printBoard();
            game.position(true);
            if (game.checkWin()>0 || game.checkTie()) break;
            game.printBoard();
            game.position(false);
            if (game.checkWin() > 0 || game.checkTie()) break;
        }
        game.printBoard();
        if (game.checkWin() > 0) System.out.println("Player " + game.checkWin() + " is the winner. Congrats :D");
        else System.out.println("The game ended in a tie. Too bad.");
    }
}