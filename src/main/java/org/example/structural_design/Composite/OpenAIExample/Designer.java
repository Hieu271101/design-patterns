package org.example.structural_design.Composite.OpenAIExample;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@ToString
@Slf4j
public class Designer implements Employee {
    private String name;
    private String position;

    @Override
    public void showDetails() {
        log.info(toString());
    }

    @Override
    public void addEmployee(Employee managerTech) {

    }

    @Override
    public void removeEmployee(Employee employee) {

    }

}
