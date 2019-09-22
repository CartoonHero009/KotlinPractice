package com.outsourcing.models

import android.content.SharedPreferences

inline internal fun SharedPreferences.applyEdit(func: SharedPreferences.Editor.() -> SharedPreferences.Editor) {
    this.edit().func().apply()
}

