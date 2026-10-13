package com.example;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public void addEmployee() {
        System.out.println("Employee added: Ram");
    }

    public void displayEmployee() {
        System.out.println("Employee ID: 101");
        System.out.println("Employee Name: Ram");
    }

    public double calculateSalary() {
        return 25000.0;
    }
}
