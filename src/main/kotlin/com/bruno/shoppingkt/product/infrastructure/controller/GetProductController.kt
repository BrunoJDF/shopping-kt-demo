package com.bruno.shoppingkt.product.infrastructure.controller

import com.bruno.shoppingkt.product.application.GetAllProductUseCase
import com.bruno.shoppingkt.product.application.port_out.ProductResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GetProductController(var getAllProductUseCase: GetAllProductUseCase): ProductController {

    @GetMapping("/get-all")
    fun getAllProducts(): List<ProductResponse> {
        return getAllProductUseCase.getAllProducts()
    }

    @GetMapping("/{productId}")
    fun getProductById(@PathVariable productId: Long): ProductResponse {
        return getAllProductUseCase.getProductById(productId)
    }
}
