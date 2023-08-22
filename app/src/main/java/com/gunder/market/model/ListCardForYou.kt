package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.gunder.market.R

data class ListCardForYou(@DrawableRes val imgCard: Int, @StringRes val txtDesc: Int)

val dummyListCardForYou = listOf(
    R.drawable.banner_vertikal1 to (R.string.txt_desc_first_banner),
    R.drawable.banner_vertikal2 to (R.string.txt_desc_second_banner),
    R.drawable.banner_vertikal3 to (R.string.txt_desc_third_banner),
    R.drawable.banner_vertikal4 to (R.string.txt_desc_fourth_banner),
    R.drawable.banner_vertikal5 to (R.string.txt_desc_five_banner),
).map { ListCardForYou(it.first, it.second) }
