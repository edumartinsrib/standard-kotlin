package com.edumrib.standard.entity.client


/**
 * A enumeração [MaritalStatus] representa os estados civis possíveis.
 *
 * @property SINGLE Solteiro(a).
 * @property MARRIED Casado(a).
 * @property DIVORCED Divorciado(a).
 * @property WIDOWED Viúvo(a).
 * @property SEPARATED Separado(a).
 * @property OTHER Outro estado civil não especificado.
 */
enum class MaritalStatus {
    SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED, OTHER;

    companion object {
        /**
         * Converte uma string para o correspondente valor da enumeração [MaritalStatus].
         *
         * @param type String representando o estado civil.
         * @return [MaritalStatus] correspondente ou [OTHER] se não for encontrado.
         */
        fun fromString(type: String): MaritalStatus {
            return values().firstOrNull { it.name.equals(type, ignoreCase = true) } ?: OTHER
        }
    }
}