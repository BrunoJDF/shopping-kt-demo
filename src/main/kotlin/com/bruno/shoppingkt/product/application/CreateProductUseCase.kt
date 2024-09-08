package com.bruno.shoppingkt.product.application

import com.bruno.shoppingkt.product.application.port_in.CreateProduct
import com.bruno.shoppingkt.product.application.port_out.ProductResponse
import com.bruno.shoppingkt.product.domain.ProductService
import org.springframework.stereotype.Service

@Service
class CreateProductUseCase(var productService: ProductService) {

    fun createProduct(createProduct: CreateProduct): ProductResponse {
        val toSave = createProduct.toProduct()
        val product = productService.create(toSave)
        return ProductResponse.fromProduct(product)
    }
}
