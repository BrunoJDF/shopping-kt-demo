package com.bruno.shoppingkt.client.infrastructure.persistence

import com.bruno.shoppingkt.client.domain.Client
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CrudClientRepository: CrudRepository<Client, UUID>
