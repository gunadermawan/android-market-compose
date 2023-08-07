package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListSpecialOffer(@DrawableRes val image: Int, @StringRes val title: Int)

val dummyListSpecialOffer = listOf(
    (R.drawable.ic_electronic to R.string.txt_category_electronic),
    (R.drawable.ic_camera to R.string.txt_category_camera),
    (R.drawable.ic_smartphone to R.string.txt_category_smartphone)
).map { ListSpecialOffer(it.first, it.second) }