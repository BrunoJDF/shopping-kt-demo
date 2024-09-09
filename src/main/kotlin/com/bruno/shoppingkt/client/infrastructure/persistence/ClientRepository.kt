package com.bruno.shoppingkt.client.infrastructure.persistence

import com.bruno.shoppingkt.client.domain.Client
import com.bruno.shoppingkt.client.domain.ClientService
import org.springframework.stereotype.Repository

@Repository
class ClientRepository(val clientRepository: CrudClientRepository): ClientService {
    override fun findAll(): List<Client> {
        return clientRepository.findAll().toList()
    }

    override fun create(toClient: Client): Client {
        return clientRepository.save(toClient)
    }
}
