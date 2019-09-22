package com.outsourcing.models

import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager


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
        return uid
    }
}