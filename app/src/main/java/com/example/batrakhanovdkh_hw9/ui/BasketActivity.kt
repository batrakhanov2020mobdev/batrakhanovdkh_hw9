package com.example.batrakhanovdkh_hw9.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batrakhanovdkh_hw9.R
import kotlinx.android.synthetic.main.activity_basket.*

class BasketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)
        setListeners()
    }


    private fun setListeners() {
        basketBackBtn.setOnClickListener {
            finish()
        }
        basketCheckoutBtn.setOnClickListener {
            startActivity(Intent(this, CheckoutActivity::class.java))
        }
        basketShowProductInfoBtn.setOnClickListener {
            startActivity(Intent(this, ProductInfoActivity::class.java))
        }
    }
}
