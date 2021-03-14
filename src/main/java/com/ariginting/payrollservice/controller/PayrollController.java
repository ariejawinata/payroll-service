package com.ariginting.payrollservice.controller;


import com.ariginting.payrollservice.service.PayrollService;
import com.ariginting.payrollservice.entity.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payroll")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @GetMapping(value = "/employee/{employeeId}")
    private Payroll getPayrollByEmployeeId(@PathVariable String employeeId) {
        return payrollService.findByEmployeeId(employeeId).get();
    }

}
