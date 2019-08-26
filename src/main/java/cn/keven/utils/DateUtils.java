package cn.keven.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author KevenPotter
 * @since 2019-08-26 13:19:25
 */
public class DateUtils {

    /**
     * 获取指定时间的最初开始时间
     *
     * @param date 指定时间
     * @return 返回指定时间的最初开始时间
     * @author KevenPotter
     * @since 2019-08-26 13:53:15
     */
    public static Date getStartDateOfTheDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取指定时间的最终结束时间
     *
     * @param date 指定时间
     * @return 返回指定时间的最终结束时间
     * @author KevenPotter
     * @since 2019-08-26 14:03:09
     */
    public static Date getEndDateOfTheDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    /**
     * 获取间隔几天之后(或之前)的时间
     *
     * @param startDate 起始时间
     * @param days      时间间隔(天)
     * @return 返回间隔几天之后(或之前)的时间
     * @author KevenPotter
     * @since 2019-08-26 13:39:19
     */
    public static Date getDateAfterDays(Date startDate, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    /**
     * 获取间隔几小时之后(或之前)的时间
     *
     * @param startDate 起始时间
     * @param hours     时间间隔(时)
     * @return 返回间隔几小时之后(或之前)的时间
     * @author KevenPotter
     * @since 2019-08-26 13:26:20
     */
    public static Date getDateAfterHours(Date startDate, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

    /**
     * 获取间隔几分钟之后(或之前)的时间
     *
     * @param startDate 起始时间
     * @param minutes   时间间隔(分)
     * @return 返回间隔几分钟之后(或之前)的时间
     * @author KevenPotter
     * @since 2019-08-26 13:47:01
     */
    public static Date getDateAfterMinutes(Date startDate, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    /**
     * 获取间隔几秒之后(或之前)的时间
     *
     * @param startDate 起始时间
     * @param seconds   时间间隔(秒)
     * @return 返回间隔几秒之后(或之前)的时间
     * @author KevenPotter
     * @since 2019-08-26 14:06:49
     */
    public static Date getDateAfterSeconds(Date startDate, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.SECOND, seconds);
        return calendar.getTime();
    }
}

class DateUtilsTest {
    public static void main(String[] args) {
        System.out.println(DateUtils.getDateAfterSeconds(DateUtils.getEndDateOfTheDay(new Date()), 1));
    }
}
