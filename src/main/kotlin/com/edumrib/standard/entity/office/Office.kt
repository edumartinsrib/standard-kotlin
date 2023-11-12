package com.edumrib.standard.entity.office

import com.edumrib.standard.entity.infos.Address
import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.*

/**
 * A classe [Office] representa as informações de um escritório.
 *
 * @property id Identificador único do escritório, gerado automaticamente pelo sistema.
 * @property name Nome do escritório.
 * @property email Endereço de e-mail do escritório.
 * @property phone Número de telefone do escritório.
 * @property cnpj Número de CNPJ (Cadastro Nacional da Pessoa Jurídica) do escritório.
 * @property address Informações de endereço associadas ao escritório.
 * @property legalInformation Informações legais incorporadas ao escritório.
 */
@Entity
@Table(name = "office")
data class Office(
    @Id @GeneratedValue
    var id: Long,
    var name: String,
    var email: String,
    var phone: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    var address: Address,
    @Embedded
    var legalInformation: LegalInformation
) : EntityAbstract() {

}

