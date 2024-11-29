package test_5_13_2;

class Order
{
    int orderId;
    String orderName;

    public Order(int id, String name)
    {
        orderId = id;
        orderName = name;
    }

    public void setter(int id, String name)
    {
        orderId = id;
        orderName = name;
    }

    public String getter()
    {
        return orderId + " " + orderName;
    }

    public boolean equals(Order obj)
    {
        if (obj == this)
            return true;
        else if (obj instanceof Order)
        {
            Order b = (Order) obj;
            return this.orderId == b.orderId && this.orderName.equals(b.orderName);
        }
        else
            return false;
    }
}
public class Test {
    public static void main(String[] args) {
        Order a = new Order(101, "曼波");
        Order b = new Order(101, "曼巴");
        System.out.println(a.equals(b));
        b.setter(101, "曼波");
        System.out.println(b.getter());
        System.out.println(a.equals(b));
    }
}
