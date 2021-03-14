package com.ariginting.payrollservice.service;

import com.ariginting.payrollservice.entity.Payroll;

import java.util.Optional;

public interface PayrollService {

    Optional<Payroll> findByEmployeeId(String employeeId);

}
