package com.bruno.shoppingkt.product.infrastructure.persistence

import com.bruno.shoppingkt.product.domain.Product
import com.bruno.shoppingkt.product.domain.ProductService
import com.bruno.shoppingkt.shared.exception.ShopNotFoundException
import org.springframework.stereotype.Repository

@Repository
class ProductRepository(var crudProductRepository: CrudProductRepository) : ProductService {

    override fun findAll(): List<Product> {
        return crudProductRepository.findAll().toList()
    }

    override fun create(toProduct: Product): Product {
        return crudProductRepository.save(toProduct)
    }

    override fun findById(productId: Long): Product {
        return crudProductRepository.findById(productId.toInt())
            .orElseThrow { ShopNotFoundException("Product with id $productId not found") }
    }
}
