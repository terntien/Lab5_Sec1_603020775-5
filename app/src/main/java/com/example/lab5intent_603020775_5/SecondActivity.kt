package com.example.lab5intent_603020775_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data :Bundle? = intent.extras
        var newStudent : Student? = data?.getParcelable<Student>(  "stData")
        idText.text = "รหัสนักศึกษา : ${newStudent?.id}"
        nameText.text = "ชื่อ-สกุล : ${newStudent?.name}"
        ageText.text = "อายุ : ${newStudent?.age}"
    }

    fun onClickClose(view: View){
        finish()
    }
}

