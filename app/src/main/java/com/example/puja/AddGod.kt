package com.example.puja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puja.databinding.ActivityAddGodBinding

class AddGod : AppCompatActivity() {
    lateinit var binding:ActivityAddGodBinding
    lateinit var database: FirebaseFire
    lateinit var model:Detail
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(R.layout.activity_add_god)
        with(binding){
            send.setOnClickListener { 
                
            }
        }
    }
    private fun addGod(){
        model= Detail()
        model.heading=heading.text.toString()
    }
}