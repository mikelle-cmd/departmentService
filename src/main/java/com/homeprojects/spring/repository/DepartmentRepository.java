package com.homeprojects.spring.repository;

import com.homeprojects.spring.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentName(String departmentName);

    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    //query fetching methods
    @Query(value = "", nativeQuery = true)
    Department findByDepartmentNameIgnoreCase(String departmentName);

}
