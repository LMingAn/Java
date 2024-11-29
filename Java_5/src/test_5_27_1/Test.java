package test_5_27_1;

class Person
{
    String name;
    int age;
    static String country;
    int id;//自动生成
    static int num = 1;

    public Person()
    {
        id = num++;
    }

    static
    {
        country = "中国";
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        id = num++;
    }

    static void setGj(String gj)
    {
        Person.country = gj;
    }

    static String getGj()
    {
        return Person.country;
    }

    void eat()
    {
        System.out.println(name + "吃饭");
    }

    void sleep()
    {
        System.out.println(name + "睡觉");
    }

    String getInfo()
    {
        return name + " " + age + " " + country + " " + id;
    }
}

class Man extends Person
{
    void eat()
    {

    }
}
public class Test {
    public static void main(String[] args) {

    }
}
