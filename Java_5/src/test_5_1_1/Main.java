package test_5_1_1;

import static java.lang.Math.sqrt;

class Point
{
    double x;
    double y;
    double z;
    String Location()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    void setX(double a)
    {
        x = a;
    }
    void setY(double a)
    {
        y = a;
    }
    void setZ(double a)
    {
        z = a;
    }
    double Distance(double x, double y, double z)
    {
        return sqrt(x * x + y * y + z * z);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Point p = new Point();
        p.setX(1.5);
        p.setY(1.2);
        p.setZ(2.1);
        System.out.println(p.Location());
        System.out.println(p.Distance(1.5, 1.2, 2.1));
    }
}