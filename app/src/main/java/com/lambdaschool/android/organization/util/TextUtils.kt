package com.lambdaschool.android.organization.util

import java.text.NumberFormat

class TextUtils {
    companion object {
        fun formatCurrency(price : Double) : String {
            val defaultCurrencyFormat = NumberFormat.getCurrencyInstance().format(price)

            return defaultCurrencyFormat
        }

        fun formatPercent(discount : Double) : String {
            val defaultPercentFormat = NumberFormat.getPercentInstance().format(discount)
            return "${defaultPercentFormat} discount!"
        }
    }
}