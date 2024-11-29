package work_6_23_7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class After100Days {
    public static void main(String[] args) {
        //输入指定的日期：年、月、日
        int year,month,day;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入小孩的出生日期年 月 日，用空格分隔：");
        year = s.nextInt();
        month = s.nextInt();
        day = s.nextInt();
        // 用输入的日期 创建LocalDate类型的日期对象date
		LocalDate date = LocalDate.of(year, month, day);
        //计算100天后的日期
        LocalDate after100Days = date.plusDays(100);
        //输出结果
        DayOfWeek daysOfWeek = after100Days.getDayOfWeek();
        String dayOfWeekStr = daysOfWeek.toString();
        System.out.println("小孩百日宴的日期为：" + after100Days);
        System.out.println("百日宴当天是" + dayOfWeekStr.charAt(0) + dayOfWeekStr.substring(1).toLowerCase());
        s.close();
    }
}