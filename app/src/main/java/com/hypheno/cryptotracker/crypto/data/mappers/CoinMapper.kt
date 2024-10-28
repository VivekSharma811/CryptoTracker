package com.hypheno.cryptotracker.crypto.data.mappers

import com.hypheno.cryptotracker.crypto.data.network.dto.CoinDto
import com.hypheno.cryptotracker.crypto.data.network.dto.CoinPriceDto
import com.hypheno.cryptotracker.crypto.domain.Coin
import com.hypheno.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
    )
}
