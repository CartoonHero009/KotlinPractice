package com.outsourcing.models

import android.app.Activity
import android.content.Intent
import com.squareup.moshi.Moshi

inline fun <reified T : Activity> Activity.startActivity(initializer: Intent.() -> Unit) {
    startActivity(
        Intent(this, T::class.java).apply(initializer)
    )
}
