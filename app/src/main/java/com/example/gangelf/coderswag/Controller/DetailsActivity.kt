package com.example.gangelf.coderswag.Controller

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.ImageView
import com.example.gangelf.coderswag.Model.Product
import com.example.gangelf.coderswag.R
import com.example.gangelf.coderswag.Utilities.EXTRA_DETAILS
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

       val productDetails = intent.getParcelableExtra<Product>(EXTRA_DETAILS)

        val resourceId = this.resources.getIdentifier(productDetails.image, "drawable", this.packageName)

        productImage.setImageResource(resourceId)
        productName.text = productDetails.title
        productPrice.text = productDetails.price

    }

    fun onSmallClicked(view: View) {
        mediumBtn.isChecked = false
        largeBtn.isChecked = false
        xLargeBtn.isChecked = false
    }

    fun onMediumClicked(view: View) {
        smallBtn.isChecked = false
        largeBtn.isChecked = false
        xLargeBtn.isChecked = false
    }

    fun onLargeClicked(view: View) {
        smallBtn.isChecked = false
        mediumBtn.isChecked = false
        xLargeBtn.isChecked = false
    }

    fun onXLargeClicked(view: View) {
        smallBtn.isChecked = false
        mediumBtn.isChecked = false
        largeBtn.isChecked = false
    }
}
