package com.hypheno.cryptotracker.crypto.domain

import com.hypheno.cryptotracker.core.domain.util.NetworkError
import com.hypheno.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}
