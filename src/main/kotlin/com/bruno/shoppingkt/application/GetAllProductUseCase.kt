package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.application.response.ProductResponse
import com.bruno.shoppingkt.domain.ProductRepository
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.stereotype.Service

@Service
class GetAllProductUseCase(var productRepository: ProductRepository) : ProductService {

    override fun getAllProducts(): List<ProductResponse> {
        return productRepository.findAll()
            .map { ProductResponse.fromProduct(it) }
    }
}
