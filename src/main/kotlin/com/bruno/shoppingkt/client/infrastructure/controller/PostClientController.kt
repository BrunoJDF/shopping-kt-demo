package com.bruno.shoppingkt.client.infrastructure.controller

import com.bruno.shoppingkt.client.application.CreateClientUseCase
import com.bruno.shoppingkt.client.application.port_out.ClientResponse
import com.bruno.shoppingkt.client.infrastructure.request.ClientRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostClientController(var createClientUseCase: CreateClientUseCase): ClientController {

    @PostMapping("/create")
    fun createClient(@RequestBody clientRequest: ClientRequest): ClientResponse {
        return createClientUseCase.save(clientRequest.toCreateClient())
    }
}
