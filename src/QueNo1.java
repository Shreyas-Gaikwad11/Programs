 // 1. TAKE TWO INT VALUES FROM USER AND PRINT GREATEST AMOUNT THEM.

 import java.util.Scanner ;
public class QueNo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" FIRST NO INPUT : ");
        int num1 = sc.nextInt();

        System.out.println(" SECOND NO INPUT : ");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("FIRST NO IS GREATER THAN SECOND NO. ");
        }

        else {
            System.out.println("SECOND NO IS GREATER THAN FIRST NO. ");
            }


    }
}
