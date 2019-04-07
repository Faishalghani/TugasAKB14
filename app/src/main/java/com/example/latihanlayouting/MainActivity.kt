package com.example.latihanlayouting

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.faishal_10116324_if14k_5)

        val start = findViewById(R.id.start) as Button
        val greeting = findViewById(R.id.greeting) as TextView
        val nunitoFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        start.setTypeface(nunitoFont, Typeface.BOLD)
        greeting.setTypeface(nunitoFont, Typeface.BOLD)


        start.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}
