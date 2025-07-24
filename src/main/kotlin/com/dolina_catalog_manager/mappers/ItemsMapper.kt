package com.dolina_catalog_manager.mappers

import com.dolina_catalog_manager.dtos.ItemsDto
import com.dolina_catalog_manager.models.ItemsModel


fun ItemsDto.toItemsModel(): ItemsModel {
    return ItemsModel(
        name = this.name,
        itemType = this.itemType,
        price = this.price
    )
}