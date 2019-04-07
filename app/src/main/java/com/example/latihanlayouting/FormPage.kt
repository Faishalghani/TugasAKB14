package com.example.latihanlayouting

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FormPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_page)

        val nunitoFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        val rubikFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");

        val name_label = findViewById(R.id.label_name) as TextView
        val age_label  = findViewById(R.id.label_age) as TextView
        val name = findViewById(R.id.name) as EditText
        val age = findViewById(R.id.ages) as EditText
        val start = findViewById(R.id.start) as Button

        start.setTypeface(nunitoFont, Typeface.NORMAL)
        name_label.setTypeface(nunitoFont, Typeface.NORMAL)
        age_label.setTypeface(nunitoFont, Typeface.NORMAL)
        name.setTypeface(rubikFont, Typeface.NORMAL)
        age.setTypeface(rubikFont, Typeface.NORMAL)

        start.setOnClickListener {
            val intent = Intent(this, SuccessPage::class.java)
            startActivity(intent)
        }
    }
}
