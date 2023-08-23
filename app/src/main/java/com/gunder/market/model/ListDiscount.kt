package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListDiscount(@DrawableRes val imgDiscount: Int, @StringRes val txtDiscount: Int)

val dummyListDiscount = listOf(
    R.drawable.ic_discount to R.string.txt_dummy_discount_10,
    R.drawable.ic_discount to R.string.txt_dummy_discount_20,
    R.drawable.ic_discount to R.string.txt_dummy_discount_30
).map { ListDiscount(it.first, it.second) }