package com.bruno.shoppingkt.client.application.port_in

import com.bruno.shoppingkt.client.domain.Client

data class CreateClient (
    val name: String,
    val email: String,
    val phone: String
){
    fun toClient(): Client {
        return Client(name = name, email = email, phone = phone)
    }
}
