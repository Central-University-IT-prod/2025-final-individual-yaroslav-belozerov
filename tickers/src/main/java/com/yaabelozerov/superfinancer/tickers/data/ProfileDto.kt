package com.yaabelozerov.superfinancer.tickers.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ProfileDto(
    val country: String,
    val currency: String,
    val exchange: String,
    val ipo: String,
    val marketCapitalization: Double,
    val name: String,
    val phone: String,
    val shareOutstanding: Double,
    val ticker: String,
    @SerialName("weburl") val webUrl: String,
    val logo: String,
    val finnhubIndustry: String,
)
