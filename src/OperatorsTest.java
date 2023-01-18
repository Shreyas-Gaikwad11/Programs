public class OperatorsTest {
    public static void main(String args[]){

        // Using Modulus Operator:
        int a = 5;
        int b = 3;
        int result = (a % b);
        System.out.println("MODULUS RESULT:"+result);

        // Using Increment Operator:
        int c = 5;
              ++c;
        System.out.println("\nINCREMENT:"+c);

        //Using Decrement Operator:
        int d = 5;
              --d;
         System.out.println("\nDECREMENT:"+d);

         // Using All Assignment Operators:
         int e = 5;
        System.out.println("\nASSIGNMENT EQUALS TO:"+e);

        int f = 5;
            f+= 3;
            System.out.println("ASSIGNMENT ADD:"+f);

        int g = 5;
            g-= 3;
             System.out.println("ASSIGNMENT SUB:"+g);

        int h = 5;
            h*= 3;
            System.out.println("ASSIGNMENT MULT:"+h);

        int i = 5;
            i/= 3;
            System.out.println("ASSIGNMENT DIV:"+i);

        int j = 5;
            j%= 3;
            System.out.println("ASSIGNMENT MODULUS:"+j);

        int k = 5;
            k&= 3;
            System.out.println("ASSIGNMENT AND:"+k);

        int l = 5;
            l|= 3;
            System.out.println("ASSIGNMENT BITWISE:"+l);

         int m = 5;
             m^= 3;
             System.out.println("ASSIGNMENT BITWISE EXCLUSIVE:"+m);

         int n = 5;
             n>>=3;
             System.out.println("ASSIGNMENT RIGHT SHIFT:"+n);

         int o = 5;
             o<<=3;
             System.out.println("ASSIGNMENT LEFT SHIFT:"+o);

             // Using Relational Operators :
         int p = 5;
         int q = 3;
         boolean b1= p==q;
             System.out.println("\nEQUAL TO    :"+b1); // returns false because 5 is not equal to 3.

         int r = 5;
         int s = 3;
         boolean b2 = r!=s;
             System.out.println("NOT EQUAL TO:"+b2); // return true because 5 is not equal to 3.

         int t = 5;
         int u = 3;
         boolean b3 = t>u;
             System.out.println("GREATER THAN:"+b3); // return true because 5 is greater than 3.

         int v = 5;
         int w = 3;
         boolean b4= v<w;
             System.out.println("LESS THAN   :"+b4); // return false because 5 is not less than 3.

         int x = 5;
         int y = 3;
         boolean b5 = x>=y;
             System.out.println("GREATER THAN OR EQUAL TO:"+b5); // return is true because 5 is greater than or equal to 3.

         int A = 5;
         int B = 3;
         boolean b6 = A<=B;
             System.out.println("LESS THAN OR EQUAL TO   :"+b6);  // return is false because 5 is greater than or equal to 3

         // Using Logical Operators :
        //  LOGICAL AND :
         int C = 5;
         int D = 3;
         int E = 8;
         boolean b7 = C>D && C<E;
             System.out.println("\nRESULT : "+b7); // return is true because 5 is greater than 3 and less than 8.

        // LOGICAL OR:
         int F = 5;
         int G = 3;
         int H = 4;
         boolean b8 = F>G || F<H;
             System.out.println("RESULT : "+b8); // return is true because one of the condition are true.
                                                // ( 5 is greater than 3 but 5 is not less than 4 so the condition is true.)

        // LOGICAL NOT:
         int I = 5;
         int J = 3;
         int K = 8;
         boolean b9 = (!(I>J && I<K));
             System.out.println("RESULT : "+b9); // returne is false because (!) not is used to reverse the result.
    }
}
