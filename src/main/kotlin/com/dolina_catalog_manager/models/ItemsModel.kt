package com.dolina_catalog_manager.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.util.UUID

@Entity
@Table(name = "tb_items")
data class ItemsModel(

    @Id
    val id: UUID = UUID.randomUUID(),

    val globalItemId: UUID = UUID.randomUUID(),

    val name: String,

    val itemType: String,

    val price: BigDecimal,
)
