package com.bruno.shoppingkt.infrastructure.persistence

import com.bruno.shoppingkt.domain.Product
import org.springframework.data.repository.CrudRepository

interface CrudProductRepository: CrudRepository<Product, Int>
