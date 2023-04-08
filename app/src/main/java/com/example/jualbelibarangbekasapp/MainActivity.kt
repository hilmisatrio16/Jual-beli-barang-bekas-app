package com.example.jualbelibarangbekasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.jualbelibarangbekasapp.adapter.BarangAdapter
import com.example.jualbelibarangbekasapp.databinding.ActivityMainBinding
import com.example.jualbelibarangbekasapp.databinding.ItemBarangBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var barangAdapter: BarangAdapter
    private lateinit var productViewModel: ProductViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        barangAdapter = BarangAdapter(ArrayList())
        
        //observe data view model
        productViewModel.getData()
        productViewModel.productVM.observe(this, Observer {
            barangAdapter.getDataProduct(it as ArrayList<ListBarang>)
        })


        binding.rvBarangBekas.adapter = barangAdapter
        binding.rvBarangBekas.layoutManager = GridLayoutManager(this, 2)


    }
}