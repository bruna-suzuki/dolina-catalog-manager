package com.dolina_catalog_manager.dtos

import java.math.BigDecimal

data class ResponseValidateItemDto(
    val itemName: String,
    val itemPrice: BigDecimal
)
