package test_5_6_3;

class ManKind
{
    int sex;
    int salary;

    void manOrWorman()
    {
        if (sex == 0)
            System.out.println("woman");
        else if (sex == 1)
            System.out.println("man");
    }

    void employeed()
    {
        if (salary == 0)
            System.out.println("no job");
        else if (salary != 0)
            System.out.println("job");
    }
}

class Kids extends ManKind
{
    int yearsOld;

    void printAge()
    {
        System.out.println(yearsOld);
    }

    void employeed()
    {
        System.out.println("Kids should study and no job.");
    }
}
public class Test {
    public static void main(String[] args) {
        Kids someKids = new Kids();
        someKids.sex = 0;
        someKids.salary = 0;
        someKids.yearsOld = 18;
        someKids.manOrWorman();
        someKids.employeed();
        someKids.printAge();
    }
}
