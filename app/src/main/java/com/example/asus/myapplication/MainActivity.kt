package com.example.asus.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

 private fun initializeView(){
     button1=findViewById(R.id.btn1)
     button2=findViewById(R.id.btn2)
     button3=findViewById(R.id.btn3)
     button4=findViewById(R.id.btn4)
     button5=findViewById(R.id.btn5)
     button6=findViewById(R.id.btn6)
     button7=findViewById(R.id.btn7)
     button8=findViewById(R.id.btn8)
     button9=findViewById(R.id.btn9)
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn1 -> changeView()
        }
    }


   private fun changeView(){

    }

}
