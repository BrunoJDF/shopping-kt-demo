package com.bruno.shoppingkt.application.port_in

import com.bruno.shoppingkt.domain.Product

data class CreateProduct (
    val name: String,
    val price: Double
) {
    fun toProduct(): Product {
        return Product(name, price)
    }
}
