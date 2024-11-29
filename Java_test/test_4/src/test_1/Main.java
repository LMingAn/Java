//package test;
//
//
//class Animal
//{
//    String name;
//    int leg;
//    public void eat()
//    {
//        System.out.println("吃饭");
//    }
//    public void sleep()
//    {
//        System.out.println("睡觉");
//    }
//    public void setName(String n)
//    {
//        name = n;
//    }
//    public void infom()
//    {
//        System.out.println("名字：" + name + " 腿数：" + leg);
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.name = "猪";
//        a.leg = 4;
//        System.out.println(a.name);
//        System.out.println(a.leg);
//        a.eat();
//        a.setName("猪");
//        a.infom();
//        Animal a1 = new Animal();
//        a1.name = "狗";
//        a1.leg = 4;
//        System.out.println(a1.name);
//        System.out.println(a1.leg);
//        a1.sleep();
//        a1.setName("狗");
//        a1.infom();
//    }



//    public static void main(String[] args) {
//        int[][] yh = new int[10][];
//        for (int a = 0; a < 10; a++)
//            yh[a] = new int[a + 1];
//        for (int a = 0; a < 10; a++)
//        {
//            for (int b = 0; b <= a; b++)
//            {
//                yh[a][0] = 1;
//                yh[a][a] = 1;
//                if (b > 0 && b < a)
//                    yh[a][b] = yh[a - 1][b - 1] + yh[a - 1][b];
//                System.out.print(yh[a][b] + " ");
//            }
//            System.out.println();
//        }
//    }



//    public static void main(String[] args)
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.print("请输入学生人数：");
//        int st = s.nextInt();
//        int max = 0;
//        System.out.println("请输入学生成绩：");
//        int[] sc = new int[st];
//        for (int a = 0; a < st; a++)
//        {
//            sc[a] = s.nextInt();
//            if (max < sc[a])
//                max = sc[a];
//        }
//        System.out.println("最高分是：" + max);
//        for (int a = 0; a < st; a++)
//        {
//            if (sc[a] >= max - 30)
//            {
//                if (sc[a] >= max - 20)
//                {
//                    if (sc[a] >= max - 10)
//                        System.out.println("student " + a + " score is " + sc[a] + " grade is A");
//                    else
//                        System.out.println("student " + a + " score is " + sc[a] + " grade is B");
//                }
//                else
//                    System.out.println("student " + a + " score is " + sc[a] + " grade is C");
//            }
//            else
//                System.out.println("student " + a + " score is " + sc[a] + " grade is D");
//        }
//    }
//}