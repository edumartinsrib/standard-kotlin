package com.edumrib.standard.entity.client

import com.edumrib.standard.entity.client.TypeClient.LEGAL
import com.edumrib.standard.entity.client.TypeClient.PHYSICAL

/**
 * A enumeração [TypeClient] representa os tipos de clientes possíveis.
 *
 * @property PHYSICAL Representa uma pessoa física.
 * @property LEGAL Representa uma pessoa jurídica.
 */
enum class TypeClient {
    PHYSICAL,
    LEGAL;

    /**
     * Obtém um valor do enum a partir de uma string, ignorando maiúsculas e minúsculas.
     *
     * @param type String representando o tipo de cliente.
     * @return [TypeClient] correspondente ou [PHYSICAL] se não for encontrado.
     */
    companion object {
        fun fromString(type: String): TypeClient {
            return TypeClient.values().firstOrNull { it.name.equals(type, ignoreCase = true) } ?: TypeClient.PHYSICAL
        }
    }
}