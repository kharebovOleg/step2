package src.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    public static void readEmployees(BufferedReader reader, List<Employee> employees,
                                      List<Employee> managers, List<Employee> others) throws IOException {
        String strEmployee;
        while ((strEmployee = reader.readLine()) != null) {
            switch (EmployeeAdd.buildEmployee(strEmployee).getPost()){
                case "employee":
                    employees.add(EmployeeAdd.buildEmployee(strEmployee));
                    break;
                case "manager":
                    managers.add(EmployeeAdd.buildEmployee(strEmployee));
                    break;
                default:
                    others.add(EmployeeAdd.buildEmployee(strEmployee));
            }
        }
    }


    public static List<Employee> findEmployeesByExample(List<Employee> employees, String example) {
        List<Employee> res = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().startsWith(example)) {
                res.add(emp);
            }
        }
        return res;
    }
}