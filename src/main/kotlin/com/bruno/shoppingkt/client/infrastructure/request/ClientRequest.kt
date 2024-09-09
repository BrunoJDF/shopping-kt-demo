package com.bruno.shoppingkt.client.infrastructure.request

import com.bruno.shoppingkt.client.application.port_in.CreateClient

data class ClientRequest(
    val name: String,
    val email: String,
    val phone: String
) {
    override fun toString(): String {
        return "ClientRequest(name='$name', email='$email', phone='$phone')"
    }

    fun toCreateClient(): CreateClient {
        return CreateClient(name = name, email = email, phone = phone)
    }
}
