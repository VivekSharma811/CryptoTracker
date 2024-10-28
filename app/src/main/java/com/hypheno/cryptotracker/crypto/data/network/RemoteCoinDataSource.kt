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
import com.hypheno.cryptotracker.crypto.data.mappers.toCoinPrice
import com.hypheno.cryptotracker.crypto.data.network.dto.CoinHistoryDto
import com.hypheno.cryptotracker.crypto.domain.CoinPrice
import io.ktor.client.request.parameter
import java.time.ZoneId
import java.time.ZonedDateTime

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

    override suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val startMillis = start
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()
        val endMillis = end
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()
        return safeCall<CoinHistoryDto> {
            httpClient.get(
                urlString = constructUrl("/assets/$coinId/history")
            ) {
                parameter("interval", "h6")
                parameter("start", startMillis)
                parameter("end", endMillis)
            }
        }.map { response ->
            response.data.map { it.toCoinPrice() }
        }
    }
}
