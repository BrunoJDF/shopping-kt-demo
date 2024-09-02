package com.bruno.shoppingkt.application

import com.bruno.shoppingkt.domain.Product
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.stereotype.Service

@Service
class GetAllProductUseCase : ProductService {
    override fun getAllProducts(): List<Product> {
        TODO("Not yet implemented")
    }
}
