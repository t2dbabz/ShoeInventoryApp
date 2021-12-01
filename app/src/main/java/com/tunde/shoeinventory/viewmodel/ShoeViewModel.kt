package com.tunde.shoeinventory.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tunde.shoeinventory.model.Shoe

class ShoeViewModel(): ViewModel() {
    private val shoeList = mutableListOf<Shoe>()

    var shoeName = ""
    var shoeSize = 0.0
    var shoeCompany = ""
    var shoeColor = ""
    var shoeDescription = ""

    private val _shoeListData = MutableLiveData<List<Shoe>>()
    val shoeListData : LiveData<List<Shoe>>
    get() = _shoeListData


    fun addShoe() {
        val shoe = Shoe(shoeName, shoeSize, shoeCompany, shoeColor, shoeDescription)
        shoeList.add(shoe)
        _shoeListData.value = shoeList
    }

    fun initializeValues() {
        shoeName = ""
        shoeSize = 0.0
        shoeCompany = ""
        shoeColor = ""
        shoeDescription = ""
    }
}