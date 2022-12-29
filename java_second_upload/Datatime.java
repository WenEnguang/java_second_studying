import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Datatime {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入格式为“****年**月**日”的日期");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d=sdf.parse(str);//将该字符串转化为日期
        Calendar c=Calendar.getInstance();//获取使用指定时区和当前语言环境的日历
        c.setTime(d);//显示一个新的时间和日期
        int year=c.get(Calendar.YEAR);
        int month =c.get(Calendar.MONTH)+1;
        int week =c.get(Calendar.DAY_OF_WEEK)-1;
        //calender类实现了公历日历，而GregorianCalender是calender类的一个具体实现
        GregorianCalendar g =new GregorianCalendar();
        if(g.isLeapYear(year)){//进行判断，返回一个布尔类型的值
            System.out.println(year+" 是闰年");
        }else{
            System.out.println(year+" 不是闰年");
        }
        int month_num =c.getActualMaximum(Calendar.DAY_OF_MONTH);//一个月中最大的天数，根据此日历的时间值返回指定日历字段可能具有的最大值

        System.out.println("该月有"+month_num+"天，"+"该日是周"+week);
    }
}

