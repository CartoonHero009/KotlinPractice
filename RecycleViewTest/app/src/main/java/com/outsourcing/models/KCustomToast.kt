package com.outsourcing.models

import android.app.Activity
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.Typeface
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.outsourcing.recycleviewtest.R

/*
class KCustomToast {
    companion object {
        val GRAVITY_TOP = 48
        val GRAVITY_CENTER = 17
        val GRAVITY_BOTTOM = 80
        private lateinit var layoutInflater: LayoutInflater
        fun infoToast(context: Activity, message: String, position: Int) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout, (context).findViewById(R.id.custom_toast_layout))
            layout.custom_toast_image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_information))
            val drawable = ContextCompat.getDrawable(context, R.drawable.toast_round_background)
            drawable?.colorFilter = PorterDuffColorFilter(ContextCompat.getColor(context, R.color.info), PorterDuff.Mode.MULTIPLY)
            layout.background = drawable
            layout.custom_toast_message.setTextColor(Color.WHITE)
            layout.custom_toast_message.text = message
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            if (position == GRAVITY_BOTTOM) {
                toast.setGravity(position, 0, 20)
            } else {
                toast.setGravity(position, 0, 0)
            }
            toast.view = layout //setting the view of custom toast layout
            toast.show()
        }
        fun infoToast(context: Activity, message: String, position: Int, font: Typeface?) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout, (context).findViewById(R.id.custom_toast_layout))
            layout.custom_toast_image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_information))
            val drawable = ContextCompat.getDrawable(context, R.drawable.toast_round_background)
            drawable?.colorFilter = PorterDuffColorFilter(ContextCompat.getColor(context, R.color.info), PorterDuff.Mode.MULTIPLY)
            layout.background = drawable
            layout.custom_toast_message.setTextColor(Color.WHITE)
            layout.custom_toast_message.text = message
            font?.let {
                layout.custom_toast_message.typeface = font
            }
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            if (position == GRAVITY_BOTTOM) {
                toast.setGravity(position, 0, 20)
            } else {
                toast.setGravity(position, 0, 0)
            }
            toast.view = layout//setting the view of custom toast layout
            toast.show()
        }
    }
}*/