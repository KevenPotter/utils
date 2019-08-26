package cn.keven.utils;

/**
 * 字符串工具类
 *
 * @author KevenPotter
 * @since 2019-08-26 15:19:16
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param string 指定字符串
     * @return 返回字符串是否为空的真假值
     * @author KevenPotter
     * @since 2019-08-26 15:22:07
     */
    public static boolean isEmpty(String string) {
        return null == string || "".equals(string.trim());
    }

    /**
     * 判断字符串是否不为空
     *
     * @param string 指定字符串
     * @return 返回字符串是否不为空的真假值
     * @author KevenPotter
     * @since 2019-08-26 15:25:54
     */
    public static boolean isNotEmpty(String string) {
        return null != string && !"".equals(string.trim()) && !"null".equalsIgnoreCase(string.trim());
    }

}

class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNotEmpty(null));
    }
}
