package src.java;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdd {
    public static Employee buildEmployee(String emp) {
        String[] arr = emp.split(",");
        String post = arr[0].trim();
        String name = arr[1].trim();
        String sirname = arr[2].trim();
        String email = arr[3].trim();
        return new Employee(post, name, sirname, email);
    }
}
