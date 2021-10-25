package com.buele.tienda.service

import com.buele.tienda.model.Producto
import com.buele.tienda.repository.Productorepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductoService {
    @Autowired
    lateinit var ProductoRepository: Productorepository


    fun list(): List<Producto> {

        return ProductoRepository.findAll()

    }
}