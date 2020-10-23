package com.zzx.jetpack.demo.ui.activity

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.zzx.jetpack.demo.R

abstract class BaseHttpVMActivity<vdb : ViewDataBinding> : BaseVMActivity<vdb>() {
    protected val loadingLiveData by lazy {
        MutableLiveData<Boolean>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadingLiveData.observe(this, Observer { show ->
            showLoading(show)
        })
    }

    private fun showLoading(show: Boolean = true) {
        val loadingView = findViewById<View>(R.id.btn_login)
        loadingView?.visibility = if (show) View.VISIBLE else View.GONE
    }
}