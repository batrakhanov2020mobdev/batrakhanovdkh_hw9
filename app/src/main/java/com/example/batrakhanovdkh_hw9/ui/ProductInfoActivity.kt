package com.example.batrakhanovdkh_hw9.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batrakhanovdkh_hw9.R
import kotlinx.android.synthetic.main.activity_product_info.*

class ProductInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_info)
        setListeners()
    }

    private fun setListeners() {
        productBackBtn.setOnClickListener {
            finish()
        }
    }
}
