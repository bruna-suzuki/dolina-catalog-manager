package com.dolina_catalog_manager.repositories

import com.dolina_catalog_manager.models.ItemsModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ItemsRepository : JpaRepository<ItemsModel, UUID> {

    fun findByGlobalItemId(globalItemId: UUID): ItemsModel?
}