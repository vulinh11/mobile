package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicked(view: View){
        var pizzaSizePrice=0.0
        var toppingsTotal = 0.0

        when {
            smallpizza.isChecked -> pizzaSizePrice = 5.0
            mediumpizza.isChecked -> pizzaSizePrice = 7.0
            largepizza.isChecked -> pizzaSizePrice =9.0
        }

        if (OnionsCheckBox.isChecked) toppingsTotal +=1
        if (OlivesCheckBox.isChecked) toppingsTotal +=2
        if (TomatoesCheckBox.isChecked) toppingsTotal +=3

        Totalprice.text = "Total Order Price=$" + (pizzaSizePrice + toppingsTotal)
    }
}