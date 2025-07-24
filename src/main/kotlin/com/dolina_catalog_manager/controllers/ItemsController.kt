package com.dolina_catalog_manager.controllers

import com.dolina_catalog_manager.dtos.ItemsDto
import com.dolina_catalog_manager.models.ItemsModel
import com.dolina_catalog_manager.services.ItemsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/items")
class ItemsController(private val itemsService: ItemsService) {

    @PostMapping
    fun createItems(@RequestBody payload: ItemsDto): ResponseEntity<ItemsModel> {
        val newItem = itemsService.createItem(payload)
        return ResponseEntity.status(HttpStatus.CREATED).body(newItem)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteItem(@PathVariable id: UUID): ResponseEntity<String> {
        itemsService.deleteItem(id)
        return ResponseEntity.status(HttpStatus.OK).body("Item has been deleted")
    }

    @GetMapping
    fun getAllItems(): ResponseEntity<List<ItemsModel>> {
        val items = itemsService.getAllItems()
        return ResponseEntity.status(HttpStatus.OK).body(items)
    }
}