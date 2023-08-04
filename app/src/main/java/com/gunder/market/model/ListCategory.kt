package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListCategory(@DrawableRes val imgCategory: Int, @StringRes val txtCategory: Int)

val dummyListCategory = listOf(
    R.drawable.ic_electronic to R.string.txt_category_electronic,
    R.drawable.ic_camera to R.string.txt_category_camera,
    R.drawable.ic_automotive to R.string.txt_category_automotive,
    R.drawable.ic_discount to R.string.txt_category_discount,
    R.drawable.ic_electronic to R.string.txt_category_electronic,
    R.drawable.ic_smartphone to R.string.txt_category_smartphone,
    R.drawable.ic_sport to R.string.txt_category_sport,
    R.drawable.ic_favorite to R.string.txt_category_for_you,
    R.drawable.ic_food to R.string.txt_category_food,
    R.drawable.ic_computer to R.string.txt_category_laptop
)