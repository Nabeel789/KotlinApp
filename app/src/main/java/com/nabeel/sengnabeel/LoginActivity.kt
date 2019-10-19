package com.nabeel.sengnabeel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nabeel.sengnabeel.util.ClickInitializer
import com.nabeel.sengnabeel.util.OnClickTextInitializer

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        var intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var onClickTextInitializer : ClickInitializer = OnClickTextInitializer(this)
        onClickTextInitializer.initialize(R.id.loginPageSignUpText)
    }
}
