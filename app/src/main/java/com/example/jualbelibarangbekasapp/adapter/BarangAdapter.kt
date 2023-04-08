package com.example.jualbelibarangbekasapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jualbelibarangbekasapp.ListBarang
import com.example.jualbelibarangbekasapp.databinding.ItemBarangBinding

class BarangAdapter(private var listBarang : ArrayList<ListBarang>) : RecyclerView.Adapter<BarangAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemBarangBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindBarang(itemData : ListBarang){
            binding.produk = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarangAdapter.ViewHolder {
        val view = ItemBarangBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BarangAdapter.ViewHolder, position: Int) {
        holder.bindBarang(listBarang[position])
    }

    override fun getItemCount(): Int {
        return listBarang.size
    }

    fun getDataProduct(itemProduk: ArrayList<ListBarang>){
        this.listBarang = itemProduk
    }
}