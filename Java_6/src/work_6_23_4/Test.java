package work_6_23_4;

class Circle
{
    private double radius;

    public double findArea()
    {
        return (radius * radius * Math.PI);
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
}

class PassObject
{
    public void printAreas(Circle c, int time)
    {
        System.out.println("半径          面积");
        for (double a = 1; a <= time; a++)
        {
            c.setRadius(a);
            System.out.println(a + "            " +  c.findArea());
        }
    }
}

public class Test
{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        PassObject p1 = new PassObject();
        p1.printAreas(c1, 5);
    }
}