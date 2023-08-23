package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListBottomCategory(
    @DrawableRes val imgBottomCategory: Int,
    @StringRes val txtBottomCategory: Int
)

val dummyListBottomCategory = listOf(
    R.drawable.play to R.string.txt_category_sport,
    R.drawable.show to R.string.txt_category_for_you,
    R.drawable.travel to R.string.txt_category_food,
    R.drawable.topup to R.string.txt_category_laptop,
    R.drawable.now to R.string.txt_live,
    R.drawable.handphone to R.string.txt_smartphone
).map { ListBottomCategory(it.first, it.second) }
