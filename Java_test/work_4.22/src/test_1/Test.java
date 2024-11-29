package test_1;

class Person
{
    String name;
    String sex;
    int age;
    void work()
    {
        System.out.println("人要工作");
    }
    void work(String n)
    {
        System.out.println("人要工作");
    }
    void work(String n, String m)
    {
        System.out.println("人要工作");
    }
    void sleep(String n)
    {
        System.out.println(n + "喜欢睡觉");
    }
    String infom()
    {
        return "名字：" + name + "性别：" + sex + "年龄：" + age;
    }
}


class TestPerson
{
    void show(Person p)
    {
        System.out.println(p.name + p.sex);
    }
    void show(Person p, Person p1)
    {
        System.out.println(p.name + p.sex);
        System.out.println(p1.name + p1.sex);
    }
}

public class Test
{
    public static void main(String[] args) {
        TestPerson t = new TestPerson();
        Person p = new Person();
        p.name = "奕力";
        p.sex = "女";
        p.age = 20;
        t.show(p);
        t.show(p, p);
        p.work(p.name);
    }
}
