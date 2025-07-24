package com.dolina_catalog_manager.dtos

import java.math.BigDecimal

data class ItemsDto(
    val name: String,
    val itemType: String,
    val price: BigDecimal
)
