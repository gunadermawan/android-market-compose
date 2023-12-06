package com.gunder.market.state

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.gunder.market.component.BottomSheet
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MarketState(
    private val scope: CoroutineScope,
    val snackBarHostState: SnackbarHostState,
    private val context: Context
) {
    var query by mutableStateOf("")
    private var isBottomSheetVisible by mutableStateOf(false)

    fun performSearch() {
        Log.d("ktx", "performSearch: $query")
        scope.launch {
            Toast.makeText(context, "performSearch: $query", Toast.LENGTH_SHORT).show()
        }
    }


    fun showBottomSheet() {
        isBottomSheetVisible = true
    }

    fun hideBottomSheet() {
        isBottomSheetVisible = false
    }

    @Composable
    fun handleBottomSheet() {
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
