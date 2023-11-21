package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(); //instanciando uma lista de string
        String path = "/home/witalo/Documentos/in.txt"; //caminho do arquivo dentro da variavel path

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //instanciando um BufferReader br com in.txt
            
            String employeeCsv = br.readLine(); //lendo uma linha do arquivo
            while (employeeCsv != null) { //enquanto a linha dentro da variavel name for diferente de nulo
                String[] fields = employeeCsv.split(","); //repartindo minha lista 
                list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); //instanciando funcionario dentro da lista
                employeeCsv = br.readLine(); //le a proxima linha
            }

            Collections.sort(list); //ordenar uma coleção
            for (Employee emp : list) { //pecorrendo a lista e imprimindo cada elemento com for each
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage());
        } 
    }
}