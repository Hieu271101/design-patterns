package org.example.structural_design.Composite.OpenAIExample;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Slf4j
public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();
    public Manager(String name, String position){
        this.name = name;
        this.position = position;
    }
    public void addEmployee(Employee employee){
        this.subordinates.add(employee);
    }
    public void removeEmployee(Employee employee){
        this.subordinates.remove(employee);
    }
    @Override
    public void showDetails() {
        for (Employee employee: subordinates){
            log.info("Manager: " + name + ", Department: " + position);
            employee.showDetails();
        }
    }
}
