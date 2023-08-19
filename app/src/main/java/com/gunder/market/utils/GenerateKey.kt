package com.gunder.market.utils

import com.gunder.market.model.ListCategory
import kotlin.random.Random

//generate unique key
val keys = mutableListOf<Int>()
fun itemKey(index: ListCategory): Int {
    while (true) {
        val key = Random.nextInt()
        if (!keys.contains(key)) {
            keys.add(key)
            return key
        }
    }
}