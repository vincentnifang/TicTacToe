package com.BIX.homework;

/**
 * @author Vincent
 */
public class Game {
    private String[][] world;
    private int n;
    private String currentUser;
    private int alreadyTic;

    Game() {
        n = 3;
        world = new String[3][3];
        currentUser = "X";
    }

    public void clear() {
        world = new String[n][n];
    }

    public void switchUser() {
        currentUser = currentUser == "X" ? "O" : "X";
    }

    public Result tic(String position) {
        return tic(position, currentUser);
    }

    private Result tic(String position, String user) {
        int x, y;
        try {
            String[] p = position.split(",");
            x = Integer.valueOf(p[0].trim());
            y = Integer.valueOf(p[1].trim());
        } catch (Exception e) {
            return new Result(Code.INVALID_INPUT);
        }
        return tic(x, y, user);
    }

    private Result tic(int x, int y, String user) {
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return new Result(Code.OUT_OF_BOUNDS);
        }
        if (world[x][y] != null) {
            return new Result(Code.TIC_ALREADY);
        }
        set(x, y, user);
        return new Result(Code.TIC_SUCCESS, isWin(x, y, user));
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (world[i][j] != null) {
                    System.out.print("[" + world[i][j] + "]");
                } else {
                    System.out.print("[ ]");
                }

            }
            System.out.println();
        }
    }

    private void set(int x, int y, String user) {
        world[x][y] = user;
        alreadyTic++;
    }

    private boolean checkRow(int x, String user) {
        for (int i = 0; i < n; i++) {
            if (world[x][i] != user) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int y, String user) {
        for (int i = 0; i < n; i++) {
            if (world[i][y] != user) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(String user) {
        return (world[0][0] == user && world[1][1] == user & world[2][2] == user) || (world[0][2] == user && world[1][1] == user & world[2][0] == user);
    }

    private boolean isWin(int x, int y, String user) {
        return checkRow(x, user) || checkColumn(y, user) || checkDiagonal(user);
    }

    public boolean noEmptyPostion() {
        return alreadyTic == 9;
    }

    public String getCurrentUser() {
        return this.currentUser;
    }
}
