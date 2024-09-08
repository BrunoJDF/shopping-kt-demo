package com.bruno.shoppingkt.product.application.port_out

import com.bruno.shoppingkt.product.domain.Product

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
