package com.victor.co.room.ui.room

import android.graphics.Color
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RoomViewModel : ViewModel() {

    private var _onOff = MutableLiveData<Boolean>()
    val onOff : LiveData<Boolean> get() = _onOff

    private var _sync = MutableLiveData<Boolean>()
    val sync : LiveData<Boolean> get() = _sync

    private var _color = MutableLiveData<Color>()
    val color : LiveData<Color> get() = _color

    private var _bright = MutableLiveData<Int>()
    val bright : LiveData<Int> get() = _bright

    private var _velocity = MutableLiveData<Int>()
    val velocity : LiveData<Int> get() = _velocity

    private var _autoOff = MutableLiveData<Boolean>()
    val autoOff : LiveData<Boolean> get() = _autoOff

    private var _autoOffHour = MutableLiveData<String>()
    val autoOffHour : LiveData<String> get() = _autoOffHour

    private var _autoOffAlways = MutableLiveData<Boolean>()
    val autoOffAlways : LiveData<Boolean> get() = _autoOffAlways

    init {
        _autoOffHour.value = "12:00"
        _onOff.value = false
    }


    fun onClickOnOff(){
        _autoOffHour.value = "04:00"
        _onOff.value = !_onOff.value!!
        Log.d("onclick","putooooooo funcionaaaa")
        Log.d("fragment",autoOffHour.value!!)
        Log.d("autooff", autoOff.value.toString())
    }
}