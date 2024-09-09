package com.bruno.shoppingkt.client.application.port_out

import com.bruno.shoppingkt.client.domain.Client

data class ClientResponse(
    val id: String,
    val name: String,
    val email: String,
    val phone: String
) {
    companion object {
        fun fromClient(res: Client): ClientResponse {
            return ClientResponse(id = res.id.toString(), name = res.name, email = res.email, phone = res.phone)
        }
    }
}
