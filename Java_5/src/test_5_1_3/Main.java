package test_5_1_3;

class Person
{
    String name;
    int age;
    String school;
    String major;

    public Person(String n, int a)
    {
        name = n;
        age = a;
    }
    public Person(String n, int a, String s)
    {
        name = n;
        age = a;
        school = s;
    }
    public Person(String n, int a, String s, String m)
    {
        name = n;
        age = a;
        school = s;
        major = m;
    }
}
public class Main
{
    public static void main(String[] args) {
        Person p1 = new Person("救赎花园", 3);
        Person p2 = new Person("最后一愿", 2, "幽梦之城大学");
        Person p3 = new Person("深石地窖", 4, "木卫二大学", "人工智能");
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age + " " + p2.school);
        System.out.println(p3.name + " " + p3.age + " " + p3.school + " " + p3.major);
    }
}
