package cn.keven.utils;

/**
 * 数字工具类
 *
 * @author KevenPotter
 * @since 2019-08-26 14:13:37
 */
public class DigitalUtils {

    /**
     * 判断指定数字是否属于所给定范围(闭区间)
     *
     * @param number 指定数字
     * @param min    最小范围(左边界值)
     * @param max    最大范围(右边界值)
     * @return 返回数字范围判断真假值
     * @author KevenPotter
     */
    public static boolean isInRange(int number, int min, int max) {
        return Math.max(min, number) == Math.min(number, max);
    }
}

class DigitalUtilsTest {
    public static void main(String[] args) {
        System.out.println(DigitalUtils.isInRange(0, 0, 1));
    }
}