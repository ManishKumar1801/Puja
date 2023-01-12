package com.example.puja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.puja.databinding.ActivityAddGodBinding
import com.google.firebase.storage.FirebaseStorage

class AddGod : AppCompatActivity() {
    lateinit var binding:ActivityAddGodBinding
    lateinit var database:FirebaseStorage
    lateinit var model:Detail
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_add_god)
        with(binding){
            send.setOnClickListener { 
                
            }
        }
    }
    private fun addGod(){
        model= Detail()
        model.heading=binding.puja.text.toString()
    }
}