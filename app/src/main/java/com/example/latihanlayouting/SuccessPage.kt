package com.example.latihanlayouting

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SuccessPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success_page)

        val nunitoFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        val success_message = findViewById(R.id.success_message) as TextView
        val start = findViewById(R.id.start) as Button

        success_message .setTypeface(nunitoFont, Typeface.NORMAL)
        start.setTypeface(nunitoFont, Typeface.NORMAL)
    }
}
