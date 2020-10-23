package com.zzx.jetpack.demo.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseVMActivity<vdb : ViewDataBinding> : AppCompatActivity() {

    val mDataBinding : vdb by lazy {
        DataBindingUtil.setContentView<vdb>(this@BaseVMActivity, getLayoutId())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding.lifecycleOwner = this
    }

    protected inline fun <reified T : ViewModel> getViewModel() : T {
        return ViewModelProvider(this).get(T::class.java)
    }

    abstract fun getLayoutId() : Int
}