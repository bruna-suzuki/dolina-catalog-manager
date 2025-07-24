package com.dolina_catalog_manager.controllers

import com.dolina_catalog_manager.dtos.RequestValidateItemDto
import com.dolina_catalog_manager.dtos.ResponseValidateItemDto
import com.dolina_catalog_manager.services.PurchaseService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/item-validator")
class PurchaseController(private val purchaseService: PurchaseService) {

    @PostMapping("/validation")
    fun validateItem(@RequestBody payload: RequestValidateItemDto): ResponseValidateItemDto {
        return purchaseService.validateItem(payload)
    }
}