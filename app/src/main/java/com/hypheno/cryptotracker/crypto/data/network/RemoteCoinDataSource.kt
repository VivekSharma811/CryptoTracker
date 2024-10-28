package com.hypheno.cryptotracker.crypto.data.network

import com.hypheno.cryptotracker.core.data.network.constructUrl
import com.hypheno.cryptotracker.core.data.network.safeCall
import com.hypheno.cryptotracker.core.domain.util.NetworkError
import com.hypheno.cryptotracker.core.domain.util.map
import com.hypheno.cryptotracker.crypto.data.mappers.toCoin
import com.hypheno.cryptotracker.crypto.data.network.dto.CoinsResponseDto
import com.hypheno.cryptotracker.crypto.domain.Coin
import com.hypheno.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import com.hypheno.cryptotracker.core.domain.util.Result

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}
