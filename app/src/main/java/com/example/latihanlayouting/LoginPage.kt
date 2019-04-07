package com.example.latihanlayouting

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val suggestion = findViewById(R.id.suggestion) as TextView
        val title = findViewById(R.id.title) as TextView
        val instruction_first = findViewById(R.id.instruction_first) as TextView
        val instruction_second = findViewById(R.id.instruction_second) as TextView
        val buy = findViewById(R.id.buy) as Button
        val login = findViewById(R.id.login) as Button
        val code = findViewById(R.id.code) as EditText

        val nunitoFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        val rubikFont: Typeface = Typeface.createFromAsset(getAssets(), "fonts/rubik_regular.ttf");

        title.setTypeface(nunitoFont, Typeface.NORMAL)
        buy.setTypeface(nunitoFont, Typeface.NORMAL)
        login.setTypeface(nunitoFont, Typeface.NORMAL)
        code.setTypeface(nunitoFont, Typeface.NORMAL)
        suggestion.setTypeface(rubikFont, Typeface.NORMAL)
        instruction_second.setTypeface(rubikFont, Typeface.NORMAL)
        instruction_first.setTypeface(rubikFont, Typeface.NORMAL)

        val sourceString = "Dengan menekan tombol masuk berarti anda menyetujui <b>Ketentuan Pengguna</b> dan " +
                "<b>Kebijakan Data</b> kami";
        instruction_second.setText(Html.fromHtml(sourceString))

        login.setOnClickListener {
            val intent = Intent(this, FormPage::class.java)
            startActivity(intent)
        }
    }
}
