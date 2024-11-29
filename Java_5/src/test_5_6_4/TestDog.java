package test_5_6_4;

class Creature
{
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Creature()
    {
        super();
        System.out.println("这是Creature构造器");
    }
}

class Animal extends Creature
{
    private String name;

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    public Animal()
    {
        super();
        System.out.println("这是Animal构造器");
    }
}

class Dog extends Animal
{
    private String hostname;

    String getHostName()
    {
        return hostname;
    }

    void setHostName(String hostname)
    {
        this.hostname = hostname;
    }

    public Dog()
    {
        super();
        System.out.println("这是Dog构造器");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(10);
        d.setName("花火");
        d.setHostName("薪炎");
        System.out.println("name:" + d.getName() + " age:" + d.getAge() + " hostName:" + d.getHostName());
    }
}
