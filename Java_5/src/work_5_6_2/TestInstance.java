package work_5_6_2;

class Person
{
    protected String name = "person";
    protected int age = 50;

    public String getInfo()
    {
        return "Name:" + name + "\n" + "age:" + age;
    }
}

class Student extends Person
{
    protected String school = "圣三一";

    public String getInfo()
    {
        return "Name:" + name + "\nage:" + age + "\nschool:" + school;
    }
}

class Graduate extends Student
{
    public String major = "IT";

    public String getInfo()
    {
        return "Name:" + name + "\nage:" + age + "\nschool:" + school + "\nmajor:" + major;
    }
}
public class TestInstance {
    public void method1(Person e)
    {
        System.out.println(e.getInfo());
        if (e instanceof Graduate)
        {
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }
        else if (e instanceof Student)
        {
            System.out.println("a student");
            System.out.println("a person");
        }
        else
        {
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        TestInstance t = new TestInstance();
        t.method1(new Person());
        t.method1(new Student());
        t.method1(new Graduate());
    }
}
