package com.gunder.market.state

import android.content.Context
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.gunder.market.component.BottomSheet
import kotlinx.coroutines.CoroutineScope

class MarketState(
    val scope: CoroutineScope,
    val snackBarHostState: SnackbarHostState,
    val context: Context
) {
    var query by mutableStateOf("")
    private var isBottomSheetVisible by mutableStateOf(false)

    fun showBottomSheet() {
        isBottomSheetVisible = true
    }

    @Composable
    fun HandleBottomSheet() {
        if (isBottomSheetVisible) {
            BottomSheet() {
                isBottomSheetVisible = false
            }
        }
    }
}

@Composable
fun rememberMarketState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    snackBarHostState: SnackbarHostState = remember { SnackbarHostState() },
    context: Context = LocalContext.current
): MarketState = remember(coroutineScope, snackBarHostState, context) {
    MarketState(coroutineScope, snackBarHostState, context)
}
