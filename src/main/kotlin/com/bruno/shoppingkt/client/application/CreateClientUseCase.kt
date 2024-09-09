package com.bruno.shoppingkt.client.application

import com.bruno.shoppingkt.client.application.port_in.CreateClient
import com.bruno.shoppingkt.client.application.port_out.ClientResponse
import com.bruno.shoppingkt.client.domain.ClientService
import org.springframework.stereotype.Service

@Service
class CreateClientUseCase(val clientService: ClientService) {

    fun save(client: CreateClient): ClientResponse {
        val res = clientService.create(client.toClient())
        return ClientResponse.fromClient(res)
    }
}
