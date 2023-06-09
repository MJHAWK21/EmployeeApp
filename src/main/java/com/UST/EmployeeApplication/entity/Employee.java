package com.UST.EmployeeApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee_tab")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String designation;

    private String employeeHr;





}
