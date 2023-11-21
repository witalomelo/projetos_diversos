package entities;

public class Employee implements Comparable<Employee> {
    
    private String name;
    private double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) { //metodo que serve para comparar um objeto com outro
        return name.compareTo(other.getName()); //comparando de acordo com o nome
        // return salary.compareTo(other.getSalary()); //compara por salario em ordem crescente
        // return -salary.compareTo(other.getSalary()); //compara por salario em ordem decrescente
    }

    
}
