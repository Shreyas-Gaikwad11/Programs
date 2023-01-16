public class HelloWord {
    public static void main(String[] args) {
        System.out.println("hello word");
        int  number   =20;
        float fnumber = 30.1F;
        char character='s';
        String name   = "shreyas";

        System.out.println(number);
        System.out.println(fnumber);
        System.out.println(character);
        System.out.println(name);

        HelloWord obj = new HelloWord();
        obj.sub();

        HelloWord Obj = new HelloWord();
        Obj.multi();

        HelloWord OBj = new HelloWord();
        obj.div();

        HelloWord OBJ = new HelloWord();
        obj.add();
    }
    void div(){
        float  num1 = 12;
        float  num2 = 5;
        float result = num1/num2;
        System.out.println("\n"+result);
    }
    void sub (){
        int num1 = 11;
        int num2 = 12;
        int result = num2-num1;
        System.out.println("\n"+result);
    }
    void multi() {
        int x = 20;
        int y = 3;
        int result = x * y;
        System.out.println("\n"+result);

    }
    void add() {
        int num1 = 11;
        int num2 = 12;
        int result = num1 + num2;
        System.out.println("\n"+result);
    }

}
