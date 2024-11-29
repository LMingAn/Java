package work_6_23_8;

import java.util.Arrays;

public class Test {
    public static int findContent(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, count = 0;
        while (i < g.length && j < s.length)
        {
            if (s[j] >= g[i])
            {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g1 = {1, 2};
        int[] s1 = {1, 2, 3};
        System.out.println("最大值为:" + findContent(g1, s1));
        int[] g2 = {1, 2, 3};
        int[] s2 = {1, 1};
        System.out.println("最大值为:" + findContent(g2, s2));
    }
}
