package com.edumrib.standard.utils.repository

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface RepositoryAbstract<Any, Long> : CrudRepository<Any, Long>, PagingAndSortingRepository<Any, Long>, JpaSpecificationExecutor<Any> {

}