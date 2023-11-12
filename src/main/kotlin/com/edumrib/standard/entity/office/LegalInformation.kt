package com.edumrib.standard.entity.office

import jakarta.persistence.Embeddable


/**
 * Representa as informações de pessoa jurídica de um cliente na aplicação.
 *
 * @property companyName Razão social do cliente.
 * @property cnpj CNPJ do cliente.
 * @property stateRegistration Inscrição estadual do cliente.
 * @property municipalRegistration Inscrição municipal do cliente.
 * @property fantasyName Nome fantasia do cliente.
 *
 */
@Embeddable
data class LegalInformation(
    var companyName: String = "",
    var cnpj: String = "",
    var stateRegistration: String = "",
    var municipalRegistration: String = "",
    var fantasyName: String = "",
)
