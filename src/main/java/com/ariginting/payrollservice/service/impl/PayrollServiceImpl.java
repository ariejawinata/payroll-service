package com.ariginting.payrollservice.service.impl;

import com.ariginting.payrollservice.repository.PayrollRepository;
import com.ariginting.payrollservice.service.PayrollService;
import com.ariginting.payrollservice.entity.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PayrollServiceImpl implements PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    @Override
    public Optional<Payroll> findByEmployeeId(String employeeId) {
        return payrollRepository.findByEmployeeId(employeeId);
    }
}
