package com.dolina_catalog_manager.services

import com.dolina_catalog_manager.dtos.RequestValidateItemDto
import com.dolina_catalog_manager.dtos.ResponseValidateItemDto
import org.springframework.stereotype.Service

@Service
class PurchaseService(private val itemsService: ItemsService) {

    fun validateItem(payload: RequestValidateItemDto): ResponseValidateItemDto {
        val item = itemsService.findByGlobalId(payload.globalItemId) ?: throw Exception("Deu ruim.")
        val response = ResponseValidateItemDto(
            itemName = item.name,
            itemPrice = item.price
        )
        return response
    }
}