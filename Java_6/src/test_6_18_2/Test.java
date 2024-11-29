package test_6_18_2;

class Thread1 extends Thread
{
    public void run()
    {
        for (int a = 1; a < 100; a++)
        {
            if (a % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + a);
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for (int a = 1; a < 100; a++)
        {
            if (a % 2 != 0)
                System.out.println(Thread.currentThread().getName() + ":" + a);
        }
    }
}

public class Test
{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
