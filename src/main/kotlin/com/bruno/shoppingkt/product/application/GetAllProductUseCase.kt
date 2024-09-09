package com.bruno.shoppingkt.product.application

import com.bruno.shoppingkt.product.application.port_out.ProductResponse
import com.bruno.shoppingkt.product.domain.ProductService
import org.springframework.stereotype.Service

@Service
class GetAllProductUseCase(var productService: ProductService) {

    fun getAllProducts(): List<ProductResponse> {
        return productService.findAll()
            .map { ProductResponse.fromProduct(it) }
    }

    fun getProductById(productId: Long): ProductResponse {
        val product = productService.findById(productId)
        return ProductResponse.fromProduct(product)
    }
}
