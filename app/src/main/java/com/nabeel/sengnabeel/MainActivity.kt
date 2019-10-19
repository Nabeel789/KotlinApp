package com.nabeel.sengnabeel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nabeel.sengnabeel.util.ClickInitializer
import com.nabeel.sengnabeel.util.OnClickButtonInitializer

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        // https://stackoverflow.com/questions/45518139/kotlin-android-start-new-activity
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // https://stackoverflow.com/questions/44536114/the-difference-between-and-in-kotlin
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var onClickButtonInitializer : ClickInitializer = OnClickButtonInitializer(this)
        onClickButtonInitializer.initialize(R.id.loginPageButton)
    }
}
