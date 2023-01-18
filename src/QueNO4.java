// 4. Write Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class QueNO4 {
    public static void main(String[]args){
        System.out.println("ENTER ANY NO : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
         System.out.println("POSITIVE NUMBER");
        }
        else if (num < 0) {
          System.out.println("NEGATIVE NUMBER");
        }
        else {
            System.out.println("NUMBER IS A ZERO ");
        }
        }
    }
