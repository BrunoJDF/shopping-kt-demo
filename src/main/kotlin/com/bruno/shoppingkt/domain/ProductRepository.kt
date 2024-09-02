package com.bruno.shoppingkt.domain

interface ProductRepository {
    fun findAll(): List<Product>
}
