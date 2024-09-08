package com.bruno.shoppingkt.product.infrastructure.request

import com.bruno.shoppingkt.product.application.port_in.CreateProduct

data class ProductRequest (
    val name: String,
    val price: Double
) {
    fun toCreateProduct(): CreateProduct {
        return CreateProduct(name, price)
    }
}
