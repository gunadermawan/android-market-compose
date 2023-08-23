package com.gunder.market.model

import com.gunder.market.R

data class ListItem(val image: Int, val title: String, val price: String)

val dummyItem = listOf(
    ListItem(R.drawable.ic_computer, "Laptop", "Rp. 12.000.000"),
    ListItem(R.drawable.ic_camera, "Camera", "Rp. 5000.000"),
    ListItem(R.drawable.ic_food, "Food", "Rp. 5000.000"),
    ListItem(R.drawable.ic_electronic, "Electronic", "Rp. 5000.000"),
    ListItem(R.drawable.ic_smartphone, "Smartphone", "Rp. 5000.000")
)

val dummyBestSeller = dummyItem.shuffled()
