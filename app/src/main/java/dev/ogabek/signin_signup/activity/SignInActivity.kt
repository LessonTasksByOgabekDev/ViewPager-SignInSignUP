package dev.ogabek.signin_signup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import dev.ogabek.signin_signup.R

class SignInActivity : AppCompatActivity() {

    private lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_sign_in)

        initViews()

    }

    private fun initViews() {
        signup = findViewById(R.id.tv_signup)
        signup.setOnClickListener {
            callSignUpActivity()
            finish()
        }
    }

    private fun callSignUpActivity() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}