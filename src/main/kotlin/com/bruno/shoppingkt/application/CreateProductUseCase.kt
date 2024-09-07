package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductRepository
import com.bruno.shoppingkt.infrastructure.request.ProductRequest
import org.springframework.stereotype.Service

@Service
class CreateProductUseCase(var productRepository: ProductRepository) {

    fun createProduct(productRequest: ProductRequest): ProductResponse {
        val toSave = ProductRequest.toProduct(productRequest)
        val product = productRepository.create(toSave)
        return ProductResponse.fromProduct(product)
    }
}
