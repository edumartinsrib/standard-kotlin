package com.edumrib.standard.repository.lawyer

import com.edumrib.standard.entity.lawyer.Lawyer
import com.edumrib.standard.utils.repository.RepositoryAbstract
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface LawyerRepository : RepositoryAbstract<Lawyer, Long> {

}