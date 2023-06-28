package lesson3;

import java.util.Scanner;

public class ReversOrder {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

          //loop for names
        for (int i = 0; i<5; i++){
            System.out.print("Enter your name: " + (i+1)+ " ");
            names[i] = scanner.nextLine();
        }


        System.out.println("Entered names:");
        for (int i = 4; i >=0; i--) {
            System.out.println(names[i]);
        }

        scanner.close();
    }




}
