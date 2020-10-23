package com.zzx.jetpack.demo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var userName = MutableLiveData<String>()
}
