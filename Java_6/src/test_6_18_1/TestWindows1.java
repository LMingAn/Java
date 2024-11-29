package test_6_18_1;

class Windows implements Runnable
{
    int ticket = 100;
    public void run()
    {
        while (true)
        {
            if (ticket > 0)
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            else
                break;
        }
    }
}

public class TestWindows1
{
    public static void main(String[] args) {
        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}