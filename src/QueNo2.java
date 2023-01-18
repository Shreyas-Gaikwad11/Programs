// 2. A school has the following rules for grading system :
//        Below 25-F
//        25 to 50 -E
//        45 to 50 -D
//        50 to 60 -C
//        60 to 80-B
//        Above 80-A
//    Ask user to  enter marks and print the corresponding grade.

import java.util.Scanner ;
public class QueNo2 {
    public static void main(String[]args){
        System.out.println("ENTER MARKS NUM : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks<=25){
         System.out.println("GRADE F");
        }
        else if (marks>=25 && marks<=45) {
            System.out.println("GRADE E");
        }
        else if (marks>=45 && marks<=50) {
            System.out.println("GRADE D");
        }
        else if (marks>=50 && marks<=60){
            System.out.println("GRADE C");
        }
        else if (marks>=60 && marks<=80) {
            System.out.println("GRADE B");
        }
        else {
            System.out.println("GRADE A");
        }

    }
}
