package com.outsourcing.models

import android.content.Context
import android.content.pm.PackageManager
import java.text.SimpleDateFormat
import java.util.*


class TestClass {

    fun getUid(context: Context): String {

        var uid = ""
        try {
            val pm = context.packageManager
            val ai = pm.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
            uid = ai.uid.toString()
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        "2018-09-10 22:01:00".toDate().formatTo("dd MMM yyyy")
        return uid
    }

    fun String.toDate(dateFormat: String = "yyyy-MM-dd HH:mm:ss", timeZone: TimeZone = TimeZone.getTimeZone("UTC")): Date {
        val parser = SimpleDateFormat(dateFormat, Locale.getDefault())
        parser.timeZone = timeZone
        return parser.parse(this)
    }

    fun Date.formatTo(dateFormat: String, timeZone: TimeZone = TimeZone.getDefault()): String {
        val formatter = SimpleDateFormat(dateFormat, Locale.getDefault())
        formatter.timeZone = timeZone
        return formatter.format(this)
    }
//    fun Toast.createToast(context: Context, message:String, gravity:Int, duration:Int){
//        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        /*first parameter is the layout you made
//        second parameter is the root view in that xml
//         */
//        val layout = inflater.inflate(R.layout.custom_toast_layout, (context as Activity).findViewById<ViewGroup>(R.id.custom_toast_container))
//
//        layout.findViewById<TextView>(R.id.text).text = message
//        setGravity(gravity, 0, 0)
//        setDuration(Toast.LENGTH_LONG);
//        setView(layout);
//        show()
//    }
}