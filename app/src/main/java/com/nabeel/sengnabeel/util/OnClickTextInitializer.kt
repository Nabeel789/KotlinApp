package com.nabeel.sengnabeel.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView

class OnClickTextInitializer(var context: Context) : ClickInitializer {
    override fun initialize(anyButtonId: Int) {
        var view: View.OnClickListener = context as View.OnClickListener
        var activity: Activity = context as Activity

        var text = activity.findViewById<TextView>(anyButtonId)
        text.setOnClickListener(view)
    }

}