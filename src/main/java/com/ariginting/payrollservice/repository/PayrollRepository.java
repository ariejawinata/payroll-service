package com.ariginting.payrollservice.repository;

import com.ariginting.payrollservice.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, String> {

    Optional<Payroll> findByEmployeeId(String employeeId);

}
