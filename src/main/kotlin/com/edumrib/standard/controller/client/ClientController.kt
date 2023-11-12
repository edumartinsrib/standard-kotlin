package com.edumrib.standard.controller.client

import com.edumrib.standard.entity.client.Client
import com.edumrib.standard.repository.client.ClientRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class ClientController(private val clientRepository: ClientRepository) {


    @RequestMapping("/client")
    fun findAll(): MutableIterable<Client> {
        return clientRepository.findAll()
    }


}