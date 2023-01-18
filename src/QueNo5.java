// 5.TAKE A TREE NUMBERS FROME THE USER AND PRONT THE GREATEST NUMBER.

import java.util.Scanner;
public class QueNo5 {
    public static void main(String[]args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("GREATEST NO IS :"+num1 );
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println("GREATEST NO IS :"+num2 );
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("GREATEST NO IS :"+num3);
        }
        else{
            System.out.println("ALL NUMBERS ARE SAME.");
        }
    }
}
