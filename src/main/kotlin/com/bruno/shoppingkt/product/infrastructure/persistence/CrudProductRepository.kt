package com.bruno.shoppingkt.product.infrastructure.persistence

import com.bruno.shoppingkt.product.domain.Product
import org.springframework.data.repository.CrudRepository

interface CrudProductRepository: CrudRepository<Product, Int>
