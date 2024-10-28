package com.hypheno.cryptotracker.crypto.presentation.coin_list

import com.hypheno.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}
