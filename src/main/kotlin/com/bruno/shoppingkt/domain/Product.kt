package com.bruno.shoppingkt.domain

class Product(
    private val id: Int,
    private val name: String,
    private val price: Double
) {
    override fun toString(): String {
        return "Product(id=$id, name='$name', price=$price)"
    }
}
