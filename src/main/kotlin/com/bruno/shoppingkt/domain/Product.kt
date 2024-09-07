package com.bruno.shoppingkt.domain

import jakarta.persistence.*

@Entity
@Table(name = "product", schema = "shopping_cart")
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

    constructor(name: String, price: Double) : this(0, name, price)
}
