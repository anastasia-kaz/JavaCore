package homework_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ganna", "Kaz", 24, 500);
        Employee e2 = new Employee(2, "Anna", "Taz", 28, 1500);
        Employee e3 = new Employee(3, "Rita", "Raz", 45, 2400);
        Employee e4 = new Employee(4, "Alex", "Baz", 54, 5800);
        Employee e5 = new Employee(5, "Oleg", "Paz", 24, 1500);
        Employee e6 = new Employee(6, "Nina", "Jaz", 35, 1000);
        Employee e7 = new Employee(7, "Mary", "Maz", 36, 1500);
        Employee e8 = new Employee(8, "Nastya", "Laz", 24, 500);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(e1, "dev");
        employees.put(e2, "dev");
        employees.put(e3, "dev");
        employees.put(e4, "qa");
        employees.put(e5, "qa");
        employees.put(e6, "sa");
        employees.put(e7, "sa");
        employees.put(e8, "pm");

        raiseSalaryForProfession(employees, 5, "qa");

        System.out.println(employees.toString());

        System.out.println(reversedMap(employees).toString());
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease, String profession) {

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();
            String prof = entry.getValue();
            System.out.println("Старая зарплата " + employee.getSalary());
            if (prof.equals(profession)) {
                employee.setSalary(employee.getSalary() + amountOfIncrease);
            }
            System.out.println("Зарплата после повышения " + employee.getSalary());

        }
    }

    private static Map<String, Collection<Employee>> reversedMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> newMap = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();
            String prof = entry.getValue();

            if (!newMap.containsKey(prof)) {
                newMap.put(prof, new ArrayList<>());
            }
            newMap.get(prof).add(employee);
        }
        return newMap;
    }


}
