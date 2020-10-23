package com.zzx.jetpack.demo.ui.activity

import android.os.Bundle
import com.zzx.jetpack.demo.R
import com.zzx.jetpack.demo.databinding.ActivityLoginBinding
import com.zzx.jetpack.demo.viewmodel.LoginViewModel

class LoginActivity: BaseVMActivity<ActivityLoginBinding>() {
    var count = 0

    private val mLoginViewModel by lazy {
        getViewModel<LoginViewModel>()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding.loginViewModel = mLoginViewModel
        mDataBinding.click = this
    }

    fun changeText() {
        count++
        mLoginViewModel.userName.value = if (count % 2 == 0) {
            "这是双数"
        } else {
            "这是单数"
        }
    }
}