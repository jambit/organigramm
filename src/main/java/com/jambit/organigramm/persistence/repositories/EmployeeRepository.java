package com.jambit.organigramm.persistence.repositories;

import com.jambit.organigramm.persistence.models.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
