package com.bruno.shoppingkt.infrastructure.request

import com.bruno.shoppingkt.domain.Product

data class ProductRequest (
    val name: String,
    val price: Double
) {
    fun toProduct(): Product {
        return Product(name, price)
    }
}
