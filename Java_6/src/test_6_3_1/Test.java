package test_6_3_1;

class Week
{
    private final String WeekName;
    private final String WeekDesc;

    private Week(String WeekName, String WeekDesc)
    {
        this.WeekName = WeekName;
        this.WeekDesc = WeekDesc;
    }

    public String getWeekName()
    {
        return WeekName;
    }
    public String getWeekDesc()
    {
        return WeekDesc;
    }

    public static final Week MONDAY = new Week("Monday", "星期一");
    public static final Week TUESDAY = new Week("Tuesday", "星期二");
    public static final Week WEDNESDAY = new Week("Wednesday", "星期三");
    public static final Week THURSDAY = new Week("Thursday", "星期四");
    public static final Week FRIDAY = new Week("Friday", "星期五");
    public static final Week SATURDAY = new Week("Saturday", "星期六");
    public static final Week SUNDAY = new Week("Sunday", "星期日");

    @Override
    public String toString()
    {
        return "Week [WeekName = " + WeekName + " , WeekDesc = " + WeekDesc + "]";
    }
}
public class Test {
    public static void main(String[] args) {
        Week monday = Week.MONDAY;
        Week tuesday = Week.TUESDAY;
        Week wednesday = Week.WEDNESDAY;
        Week thursday = Week.THURSDAY;
        Week friday = Week.FRIDAY;
        Week saturday = Week.SATURDAY;
        Week sunday = Week.SUNDAY;
        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednesday);
        System.out.println(thursday);
        System.out.println(friday);
        System.out.println(saturday);
        System.out.println(sunday);
    }
}
