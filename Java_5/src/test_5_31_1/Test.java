package test_5_31_1;

public class Test {
    public static void main(String[] args) {
        int x = 0, y = 0;
        try
        {
            y = 3 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero error");
        }
        System.out.println("program ends OK");
    }
}
