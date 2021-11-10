package com.buele.tienda.repository

import com.buele.tienda.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository:JpaRepository <Cliente,Long> {

    fun findById(id: Long?): Cliente?

}
