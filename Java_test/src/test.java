import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
//        System.out.println("请输入月：");
//        int month = input.nextInt();
//        System.out.println("请输入日：");
//        int day = input.nextInt();
//        int num = 0;
//        switch(month)
//        {
//            case 12: num += 30;
//            case 11: num += 31;
//            case 10: num += 30;
//            case 9: num += 31;
//            case 8: num += 31;
//            case 7: num += 30;
//            case 6: num += 31;
//            case 5: num += 30;
//            case 4: num += 31;
//            case 3: num += 28;
//            case 2: num += 31;
//            case 1: num += day;
//                System.out.println("第" + num + "天");
//        }
        int num = 1;
        for ( ; num <= 150; num++)
        {
            if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
                System.out.println(num + " foo " + "biz " + "baz");
            else if (num % 3 == 0 && num % 5 == 0)
                System.out.println(num + " foo " + "biz");
            else if (num % 3 == 0 && num % 7 == 0)
                System.out.println(num + " foo " + "baz");
            else if (num % 5 == 0 && num % 7 == 0)
                System.out.println(num + " biz " + "baz");
            else if (num % 3 == 0)
                System.out.println(num + " foo");
            else if (num % 5 == 0)
                System.out.println(num + " biz");
            else if (num % 7 == 0)
                System.out.println(num + " baz");
            else
                System.out.println(num);
        }
    }
}
