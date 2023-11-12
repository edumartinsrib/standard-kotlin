package com.edumrib.standard.entity.client


/**
 * Enum que representa os tipos de dependentes.
 *
 * Os tipos de dependentes incluem:
 * - SPOUSE: Cônjuge do indivíduo.
 * - CHILD: Filho do indivíduo.
 * - PARENT: Pai ou mãe do indivíduo.
 * - OTHER: Outros tipos de dependentes não especificados.
 */
enum class DependentType {
    SPOUSE,
    CHILD,
    PARENT,
    OTHER;

    /**
     * Obtém um valor do enum a partir de uma string, ignorando maiúsculas e minúsculas.
     *
     * @param type String representando o tipo de dependente.
     * @return [DependentType] correspondente ou [OTHER] se não for encontrado.
     */
    companion object {
        fun fromString(type: String): DependentType {
            return values().firstOrNull { it.name.equals(type, ignoreCase = true) } ?: OTHER
        }
    }
}