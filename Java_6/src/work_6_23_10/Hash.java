package work_6_23_10;

public class Hash {
    public static int Element(int[] nums)
    {
        int candidate = nums[0];
        int count = 1;
        for (int a = 1; a < nums.length; a++)
        {
            if (count == 0)
            {
                candidate = nums[a];
                count = 1;
            }
            else if (nums[a] == candidate)
            {
                count++;
            }
            else
                count--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("多数元素为：" + Element(nums));
    }
}
