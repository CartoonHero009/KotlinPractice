package com.outsourcing.models;

import java.util.regex.Pattern;

public class RegularJavaUtil {
    //域名字尾，需要可以新增
    private static final String[] come = {
            "top", "com.cn", "com", "net", "cn", "cc", "gov", "cn", "hk"
    };

    public static boolean isWebUrl(String url) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (String anExt : come) {
            sb.append(anExt);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        String pattern = "((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\."
                + sb.toString()
                + "(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))";
        return Pattern.compile(pattern).matcher(url).matches();
    }
}
