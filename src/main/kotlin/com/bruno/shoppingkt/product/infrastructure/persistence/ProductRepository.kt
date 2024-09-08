package com.bruno.shoppingkt.product.infrastructure.persistence

import com.bruno.shoppingkt.product.domain.Product
import com.bruno.shoppingkt.product.domain.ProductService
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
