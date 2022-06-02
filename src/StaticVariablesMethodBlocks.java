public class StaticVariablesMethodBlocks {

    //Initializing static variables
    static int a = 3;
    static int b;
    static int x = 42;

    //Static mathod
    static void method(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //Static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String args[]) {
        method(x);
    }
}
