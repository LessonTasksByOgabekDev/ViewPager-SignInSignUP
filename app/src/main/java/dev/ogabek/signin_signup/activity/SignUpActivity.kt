package dev.ogabek.signin_signup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import dev.ogabek.signin_signup.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var signIn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_sign_up)

        initViews()

    }

    private fun initViews() {
        signIn= findViewById(R.id.tv_login)
        signIn.setOnClickListener {
            callSignInActivity()
            finish()
        }
    }

    private fun callSignInActivity() {
        startActivity(Intent(this, SignInActivity::class.java))
    }

}