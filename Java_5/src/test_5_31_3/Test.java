package test_5_31_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        System.out.println(coll.size());
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        System.out.println(coll.size());
        Collection coll1 = Arrays.asList(1, 2, 3);
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll.isEmpty());
        coll.clear();
    }
}
