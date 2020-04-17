package com.sabil.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almostthere.*
import kotlinx.android.synthetic.main.activity_verify.*

class Verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val goldar = intent.getStringExtra("goldar")
        val nama = intent.getStringExtra("username")

        button2.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            intent.putExtra("username",nama)
            intent.putExtra("goldar",goldar)
            startActivity(intent)
        }





    }
}
