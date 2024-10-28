package com.hypheno.cryptotracker.di

import com.hypheno.cryptotracker.core.data.network.HttpClientFactory
import com.hypheno.cryptotracker.crypto.data.network.RemoteCoinDataSource
import com.hypheno.cryptotracker.crypto.domain.CoinDataSource
import com.hypheno.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()
    viewModelOf(::CoinListViewModel)
}
