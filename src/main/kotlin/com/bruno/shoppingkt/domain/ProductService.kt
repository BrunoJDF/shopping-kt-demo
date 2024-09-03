package com.bruno.shoppingkt.domain

import com.bruno.shoppingkt.application.response.ProductResponse

interface ProductService {

    fun getAllProducts(): List<ProductResponse>
}
