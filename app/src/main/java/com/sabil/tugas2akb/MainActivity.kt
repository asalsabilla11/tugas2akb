package com.sabil.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//Nama : Annisa Salsabilla
//Nim  : 10117196
//Kelas: IF5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TvRegister.setOnClickListener(){
            val intent = Intent(this,registeractivity::class.java)
            startActivity(intent)
        }

    }
}
