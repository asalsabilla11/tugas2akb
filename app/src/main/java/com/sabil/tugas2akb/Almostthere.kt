package com.sabil.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almostthere.*

class Almostthere : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almostthere)
        btnverify.setOnClickListener(){
            val intent = Intent(this,Verify::class.java)
            startActivity(intent)
        }
    }
}
