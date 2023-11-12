package com.edumrib.standard.service.client

import com.edumrib.standard.entity.client.Client
import com.edumrib.standard.repository.client.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(
    val clientRepository: ClientRepository
) {

    fun findAll(): MutableIterable<Client> {
        return  clientRepository.findAll()
    }

    fun findById(id: Long): Client {
        return clientRepository.findById(id).get()
    }

    fun save(client: Client): Client {
        return clientRepository.save(client)
    }

    fun deleteById(id: Long) {
        clientRepository.deleteById(id)
    }

    fun update(id: Long, client: Client): Client {
        val cliente: Client = Client()



        val clientUpdate: Client = clientRepository.findById(id).get()
        clientUpdate.phone = client.phone
        clientUpdate.actived = client.actived
        return clientRepository.save(clientUpdate)
    }



}