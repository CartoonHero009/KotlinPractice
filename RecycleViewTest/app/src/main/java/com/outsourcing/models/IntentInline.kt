package com.outsourcing.models

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

inline fun <reified T : Activity> Activity.startActivity(initializer: Intent.() -> Unit) {
    startActivity(
        Intent(this, T::class.java).apply(initializer)
    )
}