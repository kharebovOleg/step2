package src.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("path");
        List<String> employer = new ArrayList<>();
        List<String> manager = new ArrayList<>();
        List<String> others = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            if (scanner.next()) // условие, что слово  начинается с employer
                employer.add(scanner.nextLine());
            if (scanner.next()) // условие, что слово  начинается с manager
                manager.add(scanner.nextLine());
            else others.add(scanner.nextLine());
        }
    }
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя сотрудника для удаления");
        String s = scanner.next();
        System.out.println("выберите должность сотрудника: 1 - employer, 2 - manger, 3 - others ");
        int d = scanner.nextInt();
        if (d )

    }
}
