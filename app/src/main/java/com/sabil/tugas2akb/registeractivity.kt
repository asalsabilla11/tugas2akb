package com.sabil.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registeractivity.*
import android.widget.TextView

class registeractivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)

        toolbar_register.setNavigationIcon(R.drawable.ic_header_back)
        toolbar_register.setTitle("Register")
        setSupportActionBar(toolbar_register)

        btnregister2.setOnClickListener(){
            val username = usernameregis.text.toString()
            val email = emailregis.text.toString()
            val phone = Phonenumber.text.toString()
            val goldar = goldarspin.selectedItem.toString()

                if(username.isEmpty()){
                    usernameregis.hasFocus()
                    usernameregis.setError("Username harus diisi")
                }
                else if(email.isEmpty()){
                    emailregis.hasFocus()
                    emailregis.setError("Email tidak boleh kosong")
                }
                else if(phone.isEmpty()){
                    Phonenumber.hasFocus()
                    Phonenumber.setError("Nomer Telepon tidak boleh kosong")
                }
                else if(goldar == "Blood Type"){
                    val asd = goldarspin.selectedView
                    val errorTextView : TextView = asd as TextView
                    errorTextView.setError("Pilih golongan darah")
                }
                else{
                    val intent = Intent(this,Almostthere::class.java)
                    intent.putExtra("username",username)
                    intent.putExtra("goldar",goldar)
                    startActivity(intent)
                }




            }
                }
            }



