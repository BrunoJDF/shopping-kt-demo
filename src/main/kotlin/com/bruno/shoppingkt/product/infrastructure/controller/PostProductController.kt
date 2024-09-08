package com.bruno.shoppingkt.product.infrastructure.controller

import com.bruno.shoppingkt.product.application.CreateProductUseCase
import com.bruno.shoppingkt.product.application.port_out.ProductResponse
import com.bruno.shoppingkt.product.infrastructure.request.ProductRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostProductController(var createProductUseCase: CreateProductUseCase): ProductController {

    @PostMapping("/create")
    fun createProduct(@RequestBody productRequest: ProductRequest): ProductResponse {
        return createProductUseCase.createProduct(productRequest.toCreateProduct())
    }
}
