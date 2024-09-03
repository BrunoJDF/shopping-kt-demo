package com.bruno.shoppingkt.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "products")
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column
    val name: String,
    @Column
    val price: Double
) {
    override fun toString(): String {
        return "Product(id=$id, name='$name', price=$price)"
    }
}
