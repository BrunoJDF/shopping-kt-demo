package com.bruno.shoppingkt.infrastructure.persistence

import com.bruno.shoppingkt.domain.Product
import com.bruno.shoppingkt.domain.ProductService
import org.springframework.stereotype.Repository

@Repository
class ProductRepository(var crudProductRepository: CrudProductRepository) : ProductService {

    override fun findAll(): List<Product> {
        return crudProductRepository.findAll().toList()
    }

    override fun create(toProduct: Product): Product {
        return crudProductRepository.save(toProduct)
    }
}
