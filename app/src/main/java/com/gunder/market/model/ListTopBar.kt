package com.gunder.market.model

import com.gunder.market.R

data class ListTopBar(
    val imgTopBar: Int,
    val txtTopBar: Int,
    val descTopBar: Int
)

val dummyListTopBar = listOf(
    ListTopBar(R.drawable.gopay, R.string.txt_gopay, R.string.txt_dummy_gopay),
    ListTopBar(R.drawable.plus, R.string.txt_dummy_discount, R.string.txt_subscription),
    ListTopBar(R.drawable.rewards, R.string.txt_rewards, R.string.txt_dummy_rewards)
)