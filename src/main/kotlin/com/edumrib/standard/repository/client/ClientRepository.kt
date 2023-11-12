package com.edumrib.standard.repository.client

import com.edumrib.standard.entity.client.Client
import com.edumrib.standard.utils.repository.RepositoryAbstract
import org.springframework.stereotype.Repository
import java.time.LocalDateTime




@Repository
interface ClientRepository : RepositoryAbstract<Client, Long> {
}