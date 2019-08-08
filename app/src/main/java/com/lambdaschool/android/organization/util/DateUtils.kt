package com.lambdaschool.android.organization.util

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun formatDate(date: Date) : String {
            val format = SimpleDateFormat("dd/MM/yyy")
            return format.format(date)

            var i = "i"
        }

        // TODO: Other date formatting util methods here...
    }
}