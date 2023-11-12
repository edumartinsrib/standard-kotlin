package com.edumrib.standard.entity.infos

/**
 * A enumeração [PhoneType] representa os tipos de números de telefone possíveis.
 *
 * @property HOME Representa um número de telefone residencial.
 * @property MOBILE Representa um número de telefone móvel.
 * @property COMMERCIAL Representa um número de telefone comercial.
 */
enum class PhoneType {
    HOME,
    MOBILE,
    COMMERCIAL;

    companion object {
        /**
         * Converte uma string para o correspondente valor da enumeração [PhoneType].
         *
         * @param type String representando o tipo de telefone.
         * @return [PhoneType] correspondente ou [HOME] se não for encontrado.
         */
        fun fromString(type: String): PhoneType {
            return values().firstOrNull { it.name.equals(type, ignoreCase = true) } ?: HOME
        }
    }
}