package com.edumrib.standard.entity.client

import com.edumrib.standard.entity.infos.Address
import com.edumrib.standard.entity.infos.PersonalInformation
import com.edumrib.standard.entity.infos.Phone
import com.edumrib.standard.entity.office.LegalInformation
import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.*

/**
 * Representa um cliente na aplicação.
 *
 * @property id Identificador único do cliente.
 * @property legalInformation Informações legais do cliente.
 * @property personalInformation Informações pessoais do cliente.
 * @property address Endereço do cliente.
 * @property phone Lista de telefones do cliente.
 * @property typeClient Tipo do cliente.
 * @property observation Observações sobre o cliente.
 * @property dependent Informações sobre o cônjuge do cliente.
 */
@Entity
@Table(name = "client")
data class Client(
    @Id @GeneratedValue var id: Long = 0,
    @Embedded
    var legalInformation: LegalInformation = LegalInformation(),
    @Embedded
    var personalInformation: PersonalInformation = PersonalInformation(),
    @ManyToOne(cascade = [CascadeType.ALL])
    var address: Address = Address(),
    @OneToMany(cascade = [CascadeType.ALL])
    var phone: List<Phone> = mutableListOf(),
    var typeClient: TypeClient = TypeClient.PHYSICAL,
    var observation: String = "",
    @ManyToMany(cascade = [CascadeType.ALL])
    var dependent: List<Dependent> = mutableListOf(),
) : EntityAbstract() {
}