package com.bruno.shoppingkt.product.domain

interface ProductService {
    fun findAll(): List<Product>

    fun create(toProduct: Product): Product
}
