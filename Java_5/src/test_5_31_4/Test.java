package test_5_31_4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new String("AA"));
        list.add(new String("GG"));
        System.out.println(list);
        list.add(0, 555);
        System.out.println(list);
        Object obj = list.get(1);
        System.out.println(obj);
        list.remove(0);
        System.out.println(list.get(1));
    }
}
