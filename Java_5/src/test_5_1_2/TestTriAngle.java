package test_5_1_2;

class TriAngle
{
    private float base;
    private float height;

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
public class TestTriAngle
{
    public static void main(String[] args) {
        TriAngle t = new TriAngle();
        t.setBase(5);
        t.setHeight(2);
        System.out.println("S = " + (t.getBase() * t.getHeight() / 2));
    }
}
