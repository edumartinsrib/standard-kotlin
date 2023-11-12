package com.edumrib.standard.utils.entity

import java.io.Serializable
import java.time.LocalDateTime

abstract class EntityAbstract : Serializable {
    var actived: Boolean = false
    var deleted: Boolean = false
    var createdAt: LocalDateTime? = LocalDateTime.now()
    var updatedAt: LocalDateTime? = LocalDateTime.now()
    var deletedAt: LocalDateTime? = null
    var createdBy: String? = ""
    var updatedBy: String? = ""
    var deletedBy: String? = ""

    fun isActive(): Boolean {
        return this.actived
    }

    fun activate() {
        this.actived = true
        this.updatedAt = LocalDateTime.now()
    }

    fun inactivate() {
        this.actived = false
        this.updatedAt = LocalDateTime.now()
    }

    fun delete() {
        this.actived = false
        this.deleted = true
        this.deletedAt = LocalDateTime.now()
    }

    fun update() {
        this.updatedAt = LocalDateTime.now()
    }

    fun create() {
        this.createdAt = LocalDateTime.now()
    }
}