package org.example.structural_design.Composite.OpenAIExample;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "position");
        Employee designer = new Designer("Bob", "position");

        Employee managerTech = new Manager("techManager","tech lead");
        managerTech.addEmployee(dev1);
        managerTech.addEmployee(designer);

        Employee generalManager = new Manager("General manager", "manager");
        generalManager.addEmployee(managerTech);

        generalManager.showDetails();
    }
}
