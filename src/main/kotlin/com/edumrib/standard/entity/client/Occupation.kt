package com.edumrib.standard.entity.client

import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 * A classe [Occupation] representa uma ocupação ou cargo profissional.
 *
 * @property id Identificador único da ocupação, gerado automaticamente pelo sistema.
 * @property title O título da ocupação.
 * @property description Uma breve descrição da ocupação.
 * @property industry A indústria ou setor ao qual a ocupação está relacionada.
 */
@Entity
@Table(name = "occupation")
data class Occupation (
    @Id @GeneratedValue
    val id: Long = 0,
    val title: String = "",
    val description: String = "",
    val industry: String = ""
) {
}
