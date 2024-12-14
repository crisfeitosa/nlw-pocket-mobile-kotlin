package com.cristianofeitosa.nearby.ui.screen.market_details

import com.cristianofeitosa.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)