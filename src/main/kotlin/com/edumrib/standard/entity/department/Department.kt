package com.edumrib.standard.entity.department

import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "department")
data class Department(
    @Id @GeneratedValue
    val id: Long = 0,
    val name: String = "",
    val description: String = "",
    val active: Boolean = false

) : EntityAbstract() {
}