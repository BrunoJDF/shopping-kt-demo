package com.bruno.shoppingkt.infrastructure.request

import com.bruno.shoppingkt.domain.Product

data class ProductRequest (
    val name: String,
    val price: Double
) {
    companion object {
        fun toProduct(productRequest: ProductRequest): Product {
            return Product(productRequest.name, productRequest.price)
        }
    }
}
