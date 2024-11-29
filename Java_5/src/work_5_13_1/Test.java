package work_5_13_1;

class GeometricObject
{
    protected String color;
    protected double weight;

    protected GeometricObject()
    {}

    protected GeometricObject(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getColor()
    {
        return this.color;
    }

    public double getWeight()
    {
        return this.weight;
    }
}

class Circle extends GeometricObject
{
    private double radius;

    public Circle()
    {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight)
    {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double finArea()
    {
        return 2*3.14*this.radius;
    }

    public boolean equals(Circle c)
    {
        if (c == this)
            return true;
        else if (c instanceof Circle)
        {
            Circle c1 = (Circle) c;
            return this.radius == c1.radius;
        }
        else
            return false;
    }

    public String toString()
    {
        return String.valueOf(getRadius());
    }
}

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0, "white", 1.0);
        Circle c2 = new Circle(2.0, "white", 1.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
