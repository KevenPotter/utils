package cn.keven.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * HttpServletRequest工具类
 *
 * @author KevenPotter
 * @since 2019-08-26 16:31:58
 */
public class RequestParameterUtils {

    /**
     * 获取客户端请求参数中所有的信息
     *
     * @param httpServletRequest HTTP前端请求
     * @return 返回从HTTP前端请求中所获取的所有信息
     * @author KevenPotter
     * @since 2019-08-26 16:26:48
     */
    public static Map<String, Object> getRequestParameterMaps(final HttpServletRequest httpServletRequest) {
        Map<String, Object> parameterMaps = new HashMap<String, Object>();
        Enumeration<?> enumerations = httpServletRequest.getParameterNames();
        if (null != enumerations) {
            while (enumerations.hasMoreElements()) {
                String parameterName = String.valueOf(enumerations.nextElement());
                String parameterValue = httpServletRequest.getParameter(parameterName);
                parameterMaps.put(parameterName, parameterValue);
            }
        }
        return parameterMaps;
    }
}
