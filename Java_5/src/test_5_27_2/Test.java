package test_5_27_2;

abstract class Employee
{
    String name;
    int age;
    int salary;

    public Employee()
    {}

    public Employee(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    abstract void work();
}

abstract class Manager extends Employee
{
    int bonus;

    public Manager(String name, int age, int salary, int bonus)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }
}

interface Runner
{
    int ID = 1;
    void start();
    public void run();
    void stop();
}

abstract class Person implements Runner
{
    public void start()
    {
        System.out.println("准备开始");
    }

    public void run()
    {
        System.out.println("正在进行");
    }

    public void stop()
    {
        System.out.println("停止");
    }

    public void dance()
    {
        System.out.println("跳舞");
    }
}

abstract class Car implements Runner
{
    public void start()
    {
        System.out.println("准备开始");
    }

    public void run()
    {
        System.out.println("正在进行");
    }

    public void stop()
    {
        System.out.println("停止");
    }

    public void fillFuel()
    {
        System.out.println("油箱18L");
    }

    public void crack()
    {
        System.out.println("裂纹");
    }
}

abstract class Bird implements Runner
{
    public void start()
    {
        System.out.println("准备开始");
    }

    public void run()
    {
        System.out.println("正在进行");
    }

    public void stop()
    {
        System.out.println("停止");
    }

    public void fly()
    {
        System.out.println("飞行");
    }

}

public class Test {
}
