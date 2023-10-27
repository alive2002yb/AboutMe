package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done).setOnClickListener{
            addNickName(it)
        }
    }

private fun addNickName(view: View)
{
val edittext = findViewById<EditText>(R.id.nick_name)
    val nicknametext = findViewById<TextView>(R.id.nicknametext)
    nicknametext.text=edittext.text
    edittext.visibility=View.GONE
    view.visibility=View.GONE
    nicknametext.visibility=View.VISIBLE
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken,0)
}
}