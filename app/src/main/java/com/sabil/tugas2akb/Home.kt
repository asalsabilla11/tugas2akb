package com.sabil.tugas2akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val goldar = intent.getStringExtra("goldar")
        val nama = intent.getStringExtra("username")

        tv_nama_home.text = nama
        tv_bloodtype_home.text = "Blood Type : " + goldar
    }
}