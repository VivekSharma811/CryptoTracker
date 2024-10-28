package com.hypheno.cryptotracker.crypto.data.mappers

import com.hypheno.cryptotracker.crypto.data.network.dto.CoinDto
import com.hypheno.cryptotracker.crypto.domain.Coin

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