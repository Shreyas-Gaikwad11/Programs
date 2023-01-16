import java.util.Scanner;
public class ScannerDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER VALUE FIRST :");
        int val1 = sc.nextInt();

        System.out.println("ENTER VALUE SECOND :");
        int val2 = sc.nextInt();

        int result = (val1*val2);
        System.out.println("MULTIPLICATION RESULT :"+result);

    }
}



