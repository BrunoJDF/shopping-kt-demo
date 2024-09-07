package com.bruno.shoppingkt.infrastructure.controller

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetProductController(var productService: ProductService): ProductController {

    @GetMapping("/get-all")
    fun getAllProducts(): List<ProductResponse> {
        return productService.getAllProducts()
    }
}
