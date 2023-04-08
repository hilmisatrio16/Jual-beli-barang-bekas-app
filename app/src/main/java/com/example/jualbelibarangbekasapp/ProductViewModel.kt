package com.example.jualbelibarangbekasapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {

    val listBarang = arrayListOf(
        ListBarang("Vespa tahun 2000", R.drawable.img_vespa_bekas, "Rp 17.000.000",
        "Suyanto"),
        ListBarang("Mobil Agya 2017", R.drawable.img_mobil_bekas, "Rp 90.000.000",
        "Dadang"),
        ListBarang("NMAX tahun 2020", R.drawable.img_motor_bekas, "Rp 12.000.000",
        "Doni"),
        ListBarang("Sepeda Anak", R.drawable.img_sepeda_bekas, "Rp 800.000",
        "Budi"),
        ListBarang("Mesin Cuci Polytron", R.drawable.img_mesin_cuci, "Rp 300.000",
        "Nunu"),
        ListBarang("Playstation 5 ORI", R.drawable.img_ps_5, "Rp 3.500.000",
        "Joko"),
    )

    val productVM : MutableLiveData<List<ListBarang>> = MutableLiveData()

    fun getData(){
        productVM.value = listBarang
    }
}