package com.bruno.shoppingkt.application.response

import com.bruno.shoppingkt.domain.Product

data class ProductResponse(
    val id: Int,
    val name: String,
    val price: Double
) {
    companion object {
        fun fromProduct(product: Product): ProductResponse {
            return ProductResponse(product.id, product.name, product.price)
        }
    }
}
