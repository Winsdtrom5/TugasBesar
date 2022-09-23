package com.example.tugasbesar.RV

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasbesar.Tokyo
import com.example.tugasbesar.databinding.RvItemKotaBinding
import com.example.tugasbesar.entity.kota

class RVKotaAdapter(private val data: Array<kota>) : RecyclerView.Adapter<RVKotaAdapter.MainViewHolder>() {
    inner class MainViewHolder (val itemBinding: RvItemKotaBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(task: kota){
            itemBinding.itemImage.setImageResource(task.nama)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RvItemKotaBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = data[position]
        holder.bindItem(task)
        holder.itemView.setOnClickListener(){
            val id = task.id
            if(id == "Tokyo"){
                val intent = Intent(holder.itemView.context, Tokyo::class.java)
                intent.putExtra("your_extra", "your_class_value")
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
