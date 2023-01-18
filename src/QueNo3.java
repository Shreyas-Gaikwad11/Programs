// 3. Write a program to check whether a entered character is lowercase (a to z) or uppercase(A to Z).
import java.util.Scanner;

public class QueNo3 {
    public static void main (String[]args){
        System.out.println("ENTER ANY CHARACTER :");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(c >= 'a' && c <= 'z') {
            System.out.println("CHARACTER IS LOWER CASE ");
        }
        else if (c >= 'A' && c <= 'Z') {
            System.out.println("CHARACTER IS UPPER CASE ");
        }
        else {
            System.out.println("IT IS NOT CHARACTER ");
        }

    }
}
