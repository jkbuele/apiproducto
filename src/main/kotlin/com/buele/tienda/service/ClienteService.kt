package com.buele.tienda.service

import com.buele.tienda.model.Cliente
import com.buele.tienda.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository

    fun list(): List<Cliente> {

        return clienteRepository.findAll()

    }

    fun save (cliente: Cliente): Cliente{
        return clienteRepository.save(cliente)
    }
}