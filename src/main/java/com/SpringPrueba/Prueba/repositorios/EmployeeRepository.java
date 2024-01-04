package com.SpringPrueba.Prueba.repositorios;

import com.SpringPrueba.Prueba.entidades.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findByDept(String dept);
}
