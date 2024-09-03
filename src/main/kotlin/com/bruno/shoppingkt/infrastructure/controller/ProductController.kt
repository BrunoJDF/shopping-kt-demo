package com.bruno.shoppingkt.infrastructure.controller

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(var productService: ProductService) {

    @GetMapping
    fun getAllProducts(): List<ProductResponse> {
        return productService.getAllProducts()
    }
}
