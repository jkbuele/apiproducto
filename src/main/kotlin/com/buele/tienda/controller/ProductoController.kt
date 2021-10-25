package com.buele.tienda.controller

import com.buele.tienda.model.Producto
import com.buele.tienda.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])


class ProductoController {

    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto>{
        return productoService.list()
    }


}