package dev.ogabek.signin_signup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import dev.ogabek.signin_signup.R
import dev.ogabek.signin_signup.adapter.MainFragmentAdapter
import dev.ogabek.signin_signup.model.InfoPage

class MainActivity : AppCompatActivity() {

    private lateinit var dotIndicator: WormDotsIndicator
    private lateinit var viewPager: ViewPager

    private lateinit var signIn: Button
    private lateinit var signUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        dotIndicator = findViewById(R.id.dots_indicator)
        viewPager = findViewById(R.id.vp_main)
        val adapter = MainFragmentAdapter(this, addPages())
        viewPager.adapter = adapter
        dotIndicator.setViewPager(viewPager)

        signIn = findViewById(R.id.btn_sign_in)
        signUp = findViewById(R.id.btn_sign_up)

        signUp.setOnClickListener {
            callSignUpActivity()
        }

        signIn.setOnClickListener {
            callSignInActivity()
        }

    }

    private fun callSignInActivity() {
        startActivity(Intent(this, SignInActivity::class.java))
    }

    private fun callSignUpActivity() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }

    private fun addPages(): List<InfoPage> {
        return ArrayList<InfoPage>().apply {
            this.add(
                InfoPage(
                    getString(R.string.all_your_favourite_dishes),
                    getString(R.string.details)
                )
            )
            this.add(
                InfoPage(
                    getString(R.string.all_your_favourite_dishes),
                    getString(R.string.details)
                )
            )
            this.add(
                InfoPage(
                    getString(R.string.all_your_favourite_dishes),
                    getString(R.string.details)
                )
            )
        }
    }


}