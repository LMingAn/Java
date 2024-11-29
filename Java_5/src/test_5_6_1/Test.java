package test_5_6_1;

class Person {
    int xh;
    String name;
    String zy;

    void Study(String n, String z)
    {
        name = n;
        zy = z;
        System.out.println(n + "在" + z + "学习");
    }

    String getInfo()
    {
        return xh + name + zy;
    }

    public Person(int x, String n)
    {
        xh = x;
        name = n;
    }

    public Person(int x, String n, String z)
    {
        xh = x;
        name = n;
        zy = z;
    }
}
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(112, " 奕力 ", " 土木 ");
        p1.Study(" 奕力 ", " 土木 ");
        System.out.println(p1.getInfo());
    }
}
