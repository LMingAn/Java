package work_6_23_6;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("hello everyone");
        list.add("hello student");
        System.out.println("数组中的内容:");
        for (String element: list)
        {
            System.out.println(element);
        }
    }
}