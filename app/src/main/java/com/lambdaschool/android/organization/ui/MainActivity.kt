package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.ProductDetails
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails("Pizza","A delicious cheese pizza.", 0.91,32.5,0.56)
    }

    private fun displayProductDetails(inputName: String, inputDescription: String,inputTax: Double, inputPrice: Double, inputDiscount: Double) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        val item = ProductDetails(inputName,inputDescription,inputPrice,inputTax,inputDiscount)
        val price = item.productPrice
        val tax = item.productTax
        val currentDate = Date()

        productName.setText(item.productName)
        productDescription.setText(item.productDescription)
        productPrice.setText("${TextUtils.formatCurrency(price)}")
        productTax.setText("${TextUtils.formatCurrency(tax)}")
        productDiscount.setText("${TextUtils.formatPercent(item.productDiscount)}")
        totalProductPrice.setText("${TextUtils.formatCurrency(tax + price)}")
        orderDate.setText("${DateUtils.formatDate(currentDate)}")

    }
}
