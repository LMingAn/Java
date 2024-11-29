package test_5_13_1;

class Student {
    private int xh;
    private String name;
    private int age;

    public Student()
    {}

    public Student(int xh) {
        this.xh = xh;
    }

    public Student(int xh, String name)
    {
        this.xh = xh;
        this.name = name;
    }

    public Student(int xh, String name, int age)
    {
        this.xh = xh;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setXh(int xh)
    {
        this.xh = xh;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    void study()
    {
        System.out.println("学生要学习");
    }

    public int getXh()
    {
        return xh;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getInfo()
    {
        return getXh() + ' ' + getName() + ' ' + getAge();
    }
}

class ComputerStudent extends Student
{
    String bj;

    public void setBj(String bj)
    {
        this.bj = bj;
    }

    public String getInfo()
    {
        return getInfo() + " " + bj;
    }
}

class InterStudent extends ComputerStudent
{
    char sex;

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public String getInfo()
    {
        return getInfo() + ' ' + sex;
    }
}

public class Test {

    public static void main(String[] args) {

    }
}
