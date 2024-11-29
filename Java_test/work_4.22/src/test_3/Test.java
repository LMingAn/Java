package test_3;

class Boy
{
    private String name;
    private int age;
    void setName(String a)
    {
        this.name = a;
    }
    String getName()
    {
        return this.name;
    }
    void setAge(int a)
    {
        this.age = a;
    }
    int getAge(int a)
    {
        this.setAge(a);
        return this.age;
    }
    void marry(String girl, String boy)
    {
        System.out.println("marry:" + girl + " and " + boy);
    }
    void shout()
    {
        System.out.println("shout");
    }
}

class Girl
{
    private String name;
    void setName(String a)
    {
        this.name = a;
    }
    String getName()
    {
        return this.name;
    }
    void marry(String girl, String boy)
    {
        System.out.println("marry:" + girl + " and " + boy);
    }
}
public class Test {
    public static void main(String[] args) {
        Boy b = new Boy();
        Girl g = new Girl();
        b.setName("男孩");
        g.setName("女孩");
        b.getAge(19);
        b.marry(b.getName(), g.getName());
        g.marry(b.getName(), g.getName());
        b.shout();
    }
}
