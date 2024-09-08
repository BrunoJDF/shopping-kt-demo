package com.bruno.shoppingkt.product.application.port_in

import com.bruno.shoppingkt.product.domain.Product

data class CreateProduct (
    val name: String,
    val price: Double
) {
    fun toProduct(): Product {
        return Product(name, price)
    }
}
