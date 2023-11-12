package com.edumrib.standard.entity.lawyer

import com.edumrib.standard.entity.infos.Address
import com.edumrib.standard.entity.infos.PersonalInformation
import com.edumrib.standard.entity.infos.Phone
import com.edumrib.standard.utils.entity.EntityAbstract
import jakarta.persistence.*


/**
 * Representa um advogado na aplicação.
 *
 * @property id Identificador único do advogado.
 * @property name Nome do advogado.
 * @property email Email do advogado.
 * @property phone Telefone do advogado.
 */
@Entity
@Table(name = "lawyer")
data class Lawyer(
    @Id @GeneratedValue var id: Long,
    @ManyToOne(cascade = [CascadeType.ALL])
    var phone: Phone,
    var oab: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    var address: Address,
    @Embedded
    var personalInformation: PersonalInformation
) : EntityAbstract() {

}
