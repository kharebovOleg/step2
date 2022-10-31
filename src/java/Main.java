package src.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> managers = new ArrayList<>();
        List<Employee> others = new ArrayList<>();
        String pathToFile = "stuff";

        try (FileReader inputStream = new FileReader(pathToFile);
             BufferedReader bufferedReader = new BufferedReader(inputStream)) {
            EmployeeService.readEmployees(bufferedReader, employees, managers, others);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(employees);
        System.out.println(managers);
        System.out.println(others);
    }
}
