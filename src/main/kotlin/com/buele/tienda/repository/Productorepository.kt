package com.buele.tienda.repository

import com.buele.tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface Productorepository:JpaRepository <Producto,Long> {
    }
