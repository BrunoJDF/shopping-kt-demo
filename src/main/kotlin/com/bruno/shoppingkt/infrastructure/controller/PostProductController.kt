package com.bruno.shoppingkt.infrastructure.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostProductController: ProductController {

    @PostMapping("/create")
    fun createProduct() {

    }
}
