package com.edumrib.standard.entity.infos

import com.edumrib.standard.entity.client.MaritalStatus
import jakarta.persistence.Embeddable

/**
 * Representa as informações de pessoa física de um cliente na aplicação.
 *
 * @property name Nome do cliente.
 * @property cpf CPF do cliente.
 * @property rg RG do cliente.
 * @property occupation Profissão do cliente.
 * @property email E-mail do cliente.
 * @property maritalStatus Estado civil do cliente.
 *
 **/
@Embeddable
data class PersonalInformation(
    var name: String = "",
    var cpf: String = "",
    var rg: String = "",
    var occupation: String = "",
    var email: String = "",
    var maritalStatus: MaritalStatus = MaritalStatus.SINGLE,
)
