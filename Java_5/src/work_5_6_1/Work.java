package work_5_6_1;

class Person
{
    String name;
    char sex;
    int age;

    public Person(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString()
    {
        return name + sex + age;
    }
}

class Student extends Person
{
    long number;
    int math;
    int english;
    int computer;

    public Student(String n, char s, int a, long k, int m, int e, int c)
    {
        super(n, s, a);
        this.name = n;
        this.sex = s;
        this.age = a;
        this.number = k;
        this.math = m;
        this.english = e;
        this.computer = c;
    }

    double aver()
    {
        return (math + english + computer) / 3.0;
    }

    int max()
    {
        if (math > english)
        {
            if (math > computer)
                return math;
            else
                return computer;
        }
        else
        {
            if (english > computer)
                return english;
            else
                return computer;
        }
    }

    int min()
    {
        if (math < english)
        {
            if (math < computer)
                return math;
            else
                return computer;
        }
        else
        {
            if (english < computer)
                return english;
            else
                return computer;
        }
    }

    public String toString()
    {
        return "number:" + (math + english + computer) + " math:" + math + " english:" + english + " computer:" +computer;
    }
}

public class Work {
    public static void main(String[] args) {
        Person p = new Person("MEI", '女', 21);
        Student s = new Student(p.name, p.sex, p.age, 180, 90, 45, 45);
        System.out.println(p.toString());
        System.out.println("Info:" + s.toString() + "\naver:" + s.aver() + " max:" + s.max() + " min:" + s.min());
    }
}
