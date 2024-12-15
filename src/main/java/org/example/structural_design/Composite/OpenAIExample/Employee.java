package org.example.structural_design.Composite.OpenAIExample;

public interface Employee {
    void showDetails();

    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
