package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListCategory(@DrawableRes val imgTopCategory: Int, @StringRes val txtTopCategory: Int)

val dummyListTopCategory = listOf(
    R.drawable.cicil to R.string.txt_category_electronic,
    R.drawable.cod to R.string.txt_category_camera,
    R.drawable.computer to R.string.txt_category_automotive,
    R.drawable.promo to R.string.txt_category_discount,
    R.drawable.official to R.string.txt_category_electronic,
    R.drawable.paylater to R.string.txt_category_smartphone
).map { ListCategory(it.first, it.second) }

