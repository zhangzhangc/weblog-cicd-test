package com.zc.weblog.web.utils;

/**
 * @author zc
 * @date 2024/9/11 16:25
 */
public class StringUtil {

    /**
     * 判断字符串是否是纯数字
     * @param str
     * @return
     */
    public static boolean isPureNumber(String str) {
        return str.matches("\\d+");
    }

}
