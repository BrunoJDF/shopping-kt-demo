package com.bruno.shoppingkt.infrastructure.database

import com.bruno.shoppingkt.domain.Product
import com.bruno.shoppingkt.domain.ProductRepository
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl(var crudProductRepository: CrudProductRepository) : ProductRepository {

    override fun findAll(): List<Product> {
        return crudProductRepository.findAll().toList()
    }

    override fun create(toProduct: Product): Product {
        return crudProductRepository.save(toProduct)
    }
}
