package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListCategory(@DrawableRes val imgCategory: Int, @StringRes val txtCategory: Int)

val dummyListCategory = listOf(
    R.drawable.cicil to R.string.txt_category_electronic,
    R.drawable.cod to R.string.txt_category_camera,
    R.drawable.computer to R.string.txt_category_automotive,
    R.drawable.promo to R.string.txt_category_discount,
    R.drawable.official to R.string.txt_category_electronic,
    R.drawable.paylater to R.string.txt_category_smartphone,
    R.drawable.play to R.string.txt_category_sport,
    R.drawable.show to R.string.txt_category_for_you,
    R.drawable.travel to R.string.txt_category_food,
    R.drawable.topup to R.string.txt_category_laptop
).map { ListCategory(it.first, it.second) }