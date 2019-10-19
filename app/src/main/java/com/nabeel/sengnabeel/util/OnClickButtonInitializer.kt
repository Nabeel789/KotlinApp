package com.nabeel.sengnabeel.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Button

class OnClickButtonInitializer(var context : Context) : ClickInitializer{
    override fun initialize(anyButtonId: Int) {
        var view: View.OnClickListener = context as View.OnClickListener
        var activity: Activity = context as Activity

        var button = activity.findViewById<Button>(anyButtonId)
        button.setOnClickListener(view)
    }

}
