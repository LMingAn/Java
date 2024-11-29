package test_6_18_1;

class PrintNum1 implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class TestThread4
{
    public static void main(String[] args) {
        PrintNum1 p = new PrintNum1();
        Thread t = new Thread(p);
        t.start();
    }
}