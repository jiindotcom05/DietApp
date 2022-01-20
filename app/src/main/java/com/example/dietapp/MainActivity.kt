package com.example.dietapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var resultButton: Button//추후에 초기화 변수타입
    lateinit var heightEditText: EditText
    lateinit var weightEditText: EditText
    //lateinit var recommandButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultButton = findViewById<Button>(R.id.resultButton)
        heightEditText = findViewById<EditText>(R.id.heightEditText)
        weightEditText = findViewById<EditText>(R.id.weightEditText)
        //recommandButton = findViewById<Button>(R.id.recommendButton)

        resultButton.setOnClickListener {
            //버튼이 눌릴때 동작
            var intent = Intent(this, BmiResultActivity::class.java) //bmi결과페이지로 이동
            intent.putExtra("height",heightEditText.text.toString()) //입력된 키값 가져오기
            intent.putExtra("weight", weightEditText.text.toString())
            startActivity(intent)
        }
        //recommandButton.setOnClickListener {
            var intent = Intent(this, 이동할페이지::class.java)
            startActivity(intent)
        }

    }
}