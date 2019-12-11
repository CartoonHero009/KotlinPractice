package com.outsourcing.models

import java.util.regex.Pattern

val domainArr= arrayOf(  "top", "com.cn", "com", "net", "cn", "cc", "gov", "cn", "hk");
fun getCompleteUrl(text: String): Boolean {
    var sb = StringBuilder();
    sb.append("(");
    for (f in domainArr) {
        sb.append(f);
        sb.append("|");
    }
    sb.deleteCharAt(sb.length - 1);
    sb.append(")");

    val p = Pattern
        .compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\."
                + sb.toString() + "(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))",
            Pattern.CASE_INSENSITIVE);
    val matcher = p.matcher(text);
    return matcher.matches()
}