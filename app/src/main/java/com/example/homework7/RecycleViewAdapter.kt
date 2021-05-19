package com.example.homework7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework7.databinding.ExampleItemsBinding

class RecycleViewAdapter(private val animals:MutableList<AnimalModel>) : RecyclerView.Adapter<RecycleViewAdapter.ItemViewHolder>() {



    inner class ItemViewHolder(val binding: ExampleItemsBinding) : RecyclerView.ViewHolder(binding.root){

        private lateinit var  animal : AnimalModel

        fun bind()
        {
            val animal = animals[adapterPosition]
            binding.animalimage.setImageResource(animal.image)
            binding.animal.text = animal.name
            binding.description.text = animal.description
            binding.description2.text = animal.description2
            binding.description3.text = animal.description3
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val exampleView = ExampleItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val  holder = ItemViewHolder(exampleView)
        return holder

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.bind()

    }

    override fun getItemCount() = animals.size
}