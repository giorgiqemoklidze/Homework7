package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var animals = mutableListOf<AnimalModel>()

    private lateinit var adapter: RecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addata()
        init()
    }

    private fun init(){
        adapter=RecycleViewAdapter(animals)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recyclerView.adapter=adapter
    }



    private fun addata(){

        animals.add(AnimalModel(R.drawable.ic_dog_img,"cxoveli : dzagli","fexebi : 4","frtebi : 0", "kudi : 1"))
        animals.add(AnimalModel(R.drawable.ic_chickenimg,"cxoveli : qatami","fexebi : 2","frtebi : 2", "kudi : 0"))
        animals.add(AnimalModel(R.drawable.ic_elephantimg,"cxoveli : spilo","fexebi : 4","frtebi : 0", "kudi : 1"))
        animals.add(AnimalModel(R.drawable.ic_foximg,"cxoveli : mela","fexebi : 4","frtebi : 0", "kudi : 1"))
        animals.add(AnimalModel(R.drawable.ic_rabbitimg,"cxoveli : kurdgeli","fexebi : 4","frtebi : 0", "kudi : 1"))
        animals.add(AnimalModel(R.drawable.ic_squidimg,"cxoveli : rvafexa","fexebi : 8","frtebi : 0", "kudi : 0"))
        animals.add(AnimalModel(R.drawable.ic_turtleimg,"cxoveli : ku","fexebi : 4","frtebi : 0", "kudi : 1"))
        animals.add(AnimalModel(R.drawable.ic_zebraimg,"cxoveli : zebra","fexebi : 4","frtebi : 0", "kudi : 1"))

    }
}