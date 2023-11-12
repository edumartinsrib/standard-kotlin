package com.edumrib.standard.entity.lawyer

import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "legal_expertise")
data class LegalExpertise(
    @Id @GeneratedValue
    val id: Long,
    val name: String,
    val description: String? = null
) {

}
