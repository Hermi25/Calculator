package lesson5;

import java.util.Scanner;


public class SeaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sea = new int[10][10];
        int x, y;
        String result;

        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i][j] = 0;
            }
        }

        //pola ze statkami
        sea[0][0] = 1;
        sea[3][5] = 1;
        sea[5][3] = 1;
        sea[9][1] = 1;

        while (true) {
            System.out.print("Enter x: ");
            x = sc.nextInt();
            System.out.print("Enter y: ");
            y = sc.nextInt();

            if (x >= 0 && x < 10 && y >= 0 && y < 10) {
                if (sea[x][y] == 1) {
                    result = "Hit!";
                } else {
                    result = "Miss!";
                }

                System.out.println(result);
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }
}

