package com.bruno.shoppingkt.client.domain

interface ClientService {
    fun findAll(): List<Client>

    fun create(toClient: Client): Client
}
