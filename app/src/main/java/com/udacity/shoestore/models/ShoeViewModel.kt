package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel: ViewModel() {

    private val _eventSave = MutableLiveData(false)
    val eventSave: LiveData<Boolean>
        get() = eventSave

    private var _shoesList = MutableLiveData<MutableList<Shoe>>()
    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoesList

    init{
        _eventSave.value = false
        resetList()
    }

    private fun resetList(){
        _shoesList.value?.clear()
    }

    fun addShoe(shoe: Shoe){
       _shoesList.value?.add(shoe)
    }

    fun addNewItemToList(shoe: Shoe){
        _shoesList.value?.add(shoe)
    }

    fun onAddFinish(){
        _eventSave.value = false
    }
}