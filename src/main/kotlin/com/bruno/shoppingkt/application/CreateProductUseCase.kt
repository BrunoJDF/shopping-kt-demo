package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductService
import com.bruno.shoppingkt.infrastructure.request.ProductRequest
import org.springframework.stereotype.Service

@Service
class CreateProductUseCase(var productService: ProductService) {

    fun createProduct(productRequest: ProductRequest): ProductResponse {
        val toSave = productRequest.toProduct()
        val product = productService.create(toSave)
        return ProductResponse.fromProduct(product)
    }
}
