package com.edumrib.standard.entity.infos

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 * A classe [Address] representa um endereço residencial ou comercial.
 *
 * @property id Identificador único do endereço, gerado automaticamente pelo sistema.
 * @property street Nome da rua ou avenida.
 * @property number Número do imóvel.
 * @property complement Informações adicionais sobre o endereço (por exemplo, apartamento, bloco, etc.).
 * @property district Bairro ou localidade.
 * @property city Cidade.
 * @property state Estado ou região.
 * @property country País.
 * @property zipCode Código postal ou CEP.
 */
@Entity
@Table(name = "address")
data class Address(
    @Id @GeneratedValue var id: Long = 0,
    var street: String = "",
    var number: String = "",
    var complement: String = "",
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var country: String = "",
    var zipCode: String = ""
)
