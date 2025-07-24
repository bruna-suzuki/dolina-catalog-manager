package com.dolina_catalog_manager.services

import com.dolina_catalog_manager.dtos.ItemsDto
import com.dolina_catalog_manager.mappers.toItemsModel
import com.dolina_catalog_manager.models.ItemsModel
import com.dolina_catalog_manager.repositories.ItemsRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ItemsService(private val itemsRepository: ItemsRepository) {

    fun createItem(payload: ItemsDto): ItemsModel {
        val newItem = payload.toItemsModel()
        itemsRepository.save(newItem)
        return newItem
    }

    fun deleteItem(id: UUID) {
        itemsRepository.deleteById(id)
    }

    fun getAllItems(): List<ItemsModel> {
        return itemsRepository.findAll()
    }

    fun findByGlobalId(globalItemId: UUID): ItemsModel? {
        return itemsRepository.findByGlobalItemId(globalItemId)
    }
}