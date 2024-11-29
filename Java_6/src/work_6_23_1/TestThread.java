package work_6_23_1;

import java.util.Random;

class MyThread extends Thread
{
    private String WhoAml;
    private int delay;

    public MyThread(String WhoAml, int delay)
    {
        this.WhoAml = WhoAml;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(WhoAml + " 将休眠 " + delay + " 毫秒");
            Thread.sleep(delay);
            System.out.println(WhoAml + " 休眠结束");
        } catch (InterruptedException e) {
            System.out.println(WhoAml + " 被中断");
        }
    }
}

public class TestThread
{
    public void main(String[] args) {
        Random random = new Random();
        MyThread thread1 = new MyThread("Thread 1", random.nextInt(3000));
        MyThread thread2 = new MyThread("Thread 2", random.nextInt(3000));
        MyThread thread3 = new MyThread("Thread 3", random.nextInt(3000));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}