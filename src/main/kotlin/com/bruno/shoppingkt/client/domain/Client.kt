package com.bruno.shoppingkt.client.domain

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "client", schema = "shopping_cart")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID,
    val name: String,
    val email: String,
    val phone: String
) {
    override fun toString(): String {
        return "Client(id=$id, name='$name', email='$email')"
    }

    constructor(name: String, email: String, phone: String) : this(id = UUID.randomUUID(), name = name, email = email, phone = phone)
}
