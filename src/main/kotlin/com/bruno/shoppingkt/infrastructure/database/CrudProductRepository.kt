package com.bruno.shoppingkt.infrastructure.database

import com.bruno.shoppingkt.domain.Product
import org.springframework.data.repository.CrudRepository

interface CrudProductRepository: CrudRepository<Product, Int>
