package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var myName : MyName = MyName("Yog Bakhru")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName= myName
//        findViewById<Button>(R.id.done).setOnClickListener{
//            addNickName(it)
//        }
        binding.doneButton.setOnClickListener{
            addNickName(it)
    }
    }

private fun addNickName(view: View) {
//val edittext = findViewById<EditText>(R.id.nick_name)
//    val nicknametext = findViewById<TextView>(R.id.nicknametext)
//    nicknametext.text=edittext.text
//    edittext.visibility=View.GONE
//    view.visibility=View.GONE
//    nicknametext.visibility=View.VISIBLE
    binding.apply {
        //nicknameText.text=binding.nicknameEdit.text
        myName?.nickname = nicknameEdit.text.toString()
        invalidateAll()
        nicknameEdit.visibility=View.GONE
        doneButton.visibility=View.GONE
        nicknameText.visibility=View.VISIBLE
    }
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}
}