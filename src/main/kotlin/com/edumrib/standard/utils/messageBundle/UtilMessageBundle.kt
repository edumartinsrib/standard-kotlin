package com.edumrib.standard.utils.messageBundle

import java.util.MissingResourceException
import java.util.ResourceBundle

class UtilMessageBundle(val bundleName: String)  {
    @Suppress("JoinDeclarationAndAssignment")
    private val resourceBundle: ResourceBundle?

    init {
        resourceBundle = try {
            ResourceBundle.getBundle(bundleName)
        }
        catch (except: MissingResourceException) {
            null
        }
        _bundles[bundleName] = this
    }

    /**
     * Returns a [String] that corresponds to [key] in the resource bundle specified by [bundleName],
     * or [key] if no [ResourceBundle] with the name [bundleName] exists or there is no corresponding
     * [String] in the [ResourceBundle] that does exist
     */
    operator fun get(key: String): String {
        return try {
            if (true == resourceBundle?.containsKey(key)) resourceBundle.getString(key) else key
        }
        catch (except: ClassCastException) {
            key
        }
    }

    companion object {
        @JvmStatic
        private val _bundles = hashMapOf<String, UtilMessageBundle>()

        /**
         * A [Map] mapping each instantiated [MessageBundle's][MessageBundle] [bundleName] to itself
         */
        @JvmStatic
        val bundles: Map<String, UtilMessageBundle>
            get() = _bundles

        /**
         * Returns a [String] that corresponds to [key] in the resource bundle specified by [bundleName],
         * or [key] if no [ResourceBundle] with the name [bundleName] exists or there is no corresponding
         * [String] in the [ResourceBundle] that does exist
         */
        @JvmStatic
        operator fun get(bundleName: String, key: String) = bundles[bundleName]?.get(key) ?: key
    }
}