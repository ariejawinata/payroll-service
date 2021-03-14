package com.ariginting.payrollservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "payroll")
public class Payroll {

    @Id
    @Column(name = "id", length = 40)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "employee_id", length = 40)
    private String employeeId;

}
