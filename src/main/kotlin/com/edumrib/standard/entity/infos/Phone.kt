package com.edumrib.standard.entity.infos

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 * A classe [Phone] representa um número de telefone associado a uma entidade.
 *
 * @property id Identificador único do número de telefone, gerado automaticamente pelo sistema.
 * @property ddd Código de discagem direta à distância.
 * @property number Número do telefone.
 * @property type Tipo do número de telefone (por padrão, [PhoneType.MOBILE]).
 */
@Entity
@Table(name = "phone")
data class Phone(
    @Id @GeneratedValue var id: Long,
    @Column(nullable = false, length = 3)
    var ddd: String,
    @Column(nullable = false, length = 10)
    var number: String,
    var type: PhoneType = PhoneType.MOBILE
)
