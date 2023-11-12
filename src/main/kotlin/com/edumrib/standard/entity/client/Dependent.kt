package com.edumrib.standard.entity.client

import com.edumrib.standard.entity.infos.PersonalInformation
import com.edumrib.standard.entity.infos.Phone
import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.*

/**
 * Representa um dependente na aplicação.
 *
 * @property id Identificador único do dependente.
 * @property personalInformation Informações pessoais do dependente.
 * @property occupation Lista de ocupações associadas ao dependente.
 * @property email Endereço de e-mail do dependente.
 * @property phone Lista de telefones do dependente.
 */
@Entity
@Table(name = "dependent")
data class Dependent(
    @Id @GeneratedValue
    var id: Long,
    @Embedded
    var personalInformation: PersonalInformation,
    @ManyToMany(cascade = [CascadeType.ALL])
    var occupation: List<Occupation> = mutableListOf(),
    @ManyToMany(cascade = [CascadeType.ALL])
    var phone: List<Phone> = mutableListOf(),
) : EntityAbstract() {
}
