package com.bruno.shoppingkt.infrastructure.controller

import com.bruno.shoppingkt.application.GetAllProductUseCase
import com.bruno.shoppingkt.application.port_out.ProductResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetProductController(var getAllProductUseCase: GetAllProductUseCase): ProductController {

    @GetMapping("/get-all")
    fun getAllProducts(): List<ProductResponse> {
        return getAllProductUseCase.getAllProducts()
    }
}
