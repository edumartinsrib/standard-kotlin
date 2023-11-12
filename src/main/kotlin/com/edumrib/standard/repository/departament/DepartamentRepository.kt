package com.edumrib.standard.repository.departament

import com.edumrib.standard.entity.client.Client
import com.edumrib.standard.entity.department.Department
import com.edumrib.standard.utils.repository.RepositoryAbstract
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface DepartamentRepository : RepositoryAbstract<Department, Long>{


}