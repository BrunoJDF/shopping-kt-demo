package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductRepository
import org.springframework.stereotype.Service

@Service
class GetAllProductUseCase(var productRepository: ProductRepository) {

    fun getAllProducts(): List<ProductResponse> {
        return productRepository.findAll()
            .map { ProductResponse.fromProduct(it) }
    }
}
