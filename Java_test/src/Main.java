import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int grade = s.nextInt();
//        if (grade == 100)
//            System.out.println("奖励一台BWM");
//        else if (grade > 80 && grade <= 99)
//            System.out.println("奖励一台iphone12");
//        else if (grade >= 60 && grade <= 80)
//            System.out.println("奖励一本参考书");
//        System.out.println("身高：");
//        int high = s.nextInt();
//        System.out.println("身价：");
//        double price = s.nextDouble();
//        System.out.println("帅否：(是/否)");
//        String hand = s.next();
//        if (high >= 180 && price >= 1000 && hand.equals("是"))
//            System.out.println("我一定要嫁给他!!!");
//        else if (high >= 180 || price >= 1000 || hand.equals("是"))
//            System.out.println("嫁吧，比上不足，比下有余。");
//        else
//            System.out.println("不嫁!");
        int year = 0;
        int month = 0;
        int day = 0;
        int conut = 0;
        System.out.println("输入年：");
        year = s.nextInt();
        System.out.println("输入月：");
        month = s.nextInt();
        System.out.println("输入日：");
        day = s.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            switch (month)
            {
                case 12: conut += 30;
                case 11: conut += 31;
                case 10: conut += 30;
                case 9: conut += 31;
                case 8: conut += 31;
                case 7: conut += 30;
                case 6: conut += 31;
                case 5: conut += 30;
                case 4: conut += 31;
                case 3: conut += 29;
                case 2: conut += 31;
                case 1: conut += day;
                    System.out.println("第" + conut + "天");
            }
        }
        else
        {
            switch (month)
            {
                case 12: conut += 30;
                case 11: conut += 31;
                case 10: conut += 30;
                case 9: conut += 31;
                case 8: conut += 31;
                case 7: conut += 30;
                case 6: conut += 31;
                case 5: conut += 30;
                case 4: conut += 31;
                case 3: conut += 28;
                case 2: conut += 31;
                case 1: conut += day;
                    System.out.println("第" + conut + "天");
            }
        }
    }
}