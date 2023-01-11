package com.example.puja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.puja.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyAdapter
    lateinit var arrayList: ArrayList<Detail>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){
            arrayList= ArrayList()
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            arrayList.add(Detail(R.drawable.radha, "GanPati Puja","lord Ganesha is very famous","RS.1001"))
            adapter= MyAdapter(arrayList)
            recyclerview.adapter=adapter
            recyclerview.layoutManager=LinearLayoutManager(this@MainActivity)
        }
    }
}