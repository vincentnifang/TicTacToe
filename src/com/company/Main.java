package com.company;

import java.util.Scanner;

/**
 * @author Vincent
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Game start...X first");
        System.out.println("example: 1,1");
        game.print();
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;
        while(!isEnd) {
            System.out.println("User "+ game.getCurrentUser() + " Pls tic the position: ");
            Result r = game.tic(sc.nextLine());
            if (r.code == Code.TIC_SUCCESS) {
                game.print();
                if (r.isWin) {
                    isEnd = true;
                    System.out.println("User "+ game.getCurrentUser() + " is win");
                }
                if (game.noEmptyPostion()) {
                    isEnd = true;
                    System.out.println("No winner for this game");
                }
                game.switchUser();
            } else {
                System.out.println(r.code.getMessage());
            }
        }
    }
}
