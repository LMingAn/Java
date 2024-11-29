package test_2;

class Person
{
    private int age;
    void setAge(int a)
    {
        age = a;
    }
    int getAge()
    {
        return age;
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(30);
        System.out.println(b.getAge());
    }
}
