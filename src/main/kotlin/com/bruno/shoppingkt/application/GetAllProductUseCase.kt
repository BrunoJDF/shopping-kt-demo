package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.stereotype.Service

@Service
class GetAllProductUseCase(var productService: ProductService) {

    fun getAllProducts(): List<ProductResponse> {
        return productService.findAll()
            .map { ProductResponse.fromProduct(it) }
    }
}
