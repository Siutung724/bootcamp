import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static void main(String[] args) {
    // Peter, 2020-OCT-23, 15000.00
    // John, 2019-JAN-31, 23000.00
    // Mary, 2022-MAY-05, 37000.00
    // Leo, 2002-DEC-10, 58000.00
    List<Employee> employees = new LinkedList<>();
    employees
        .add(new Employee(1, "Peter", LocalDate.of(2020, 10, 23), 15000.00));
    employees.add(new Employee(2, "John", LocalDate.of(2019, 1, 31), 23000.00));
    employees.add(new Employee(3, "Mary", LocalDate.of(2022, 5, 5), 37000.00));
    employees.add(new Employee(4, "Leo", LocalDate.of(2002, 12, 10), 58000.00));

    // ! Find all of their salary
    List<Double> salaries = employees.stream() //
        .map(e -> e.getSalary()) //
        .collect(Collectors.toList());
    System.out.println(salaries);

    // ! Find all of their join dates.
    List<LocalDate> joinDates = employees.stream() //
        .map(e -> e.getJoinDate()) //
        .collect(Collectors.toList());
    System.out.println(joinDates);

    // ! Find all employee names, who joined the company before 2020-Jan-01
    List<String> employeeNames = employees.stream() //
        .filter(e -> e.getJoinDate().isBefore(LocalDate.of(2020, 1, 1))) //
        .map(e -> e.getName()) //
        .collect(Collectors.toList());
    System.out.println(employeeNames);

    // ! Find all employees with salary > 25000.00
    List<Employee> targetEmployees = employees.stream() //
        .filter(e -> e.getSalary() > 25000.00) //
        .collect(Collectors.toList());
    System.out.println(targetEmployees);

    // ! Java 8
    Stream<String> names = Stream.of("John", "Peter", "Leo", "Peter");
    long num = names.filter(e -> e.length() > 4).count();
    System.out.println(num);

    List<Integer> marksix = Stream.generate(() -> new Random().nextInt(49) + 1) //
        .limit(6) //
        .collect(Collectors.toList());
    System.out.println(marksix);

    // ! Collectors.toSet() -> return unique elements (equals and hashCode)
    Stream<String> names2 = Stream.of("John", "Peter", "Leo", "Peter");
    long uniqueNameCount = names2.distinct() // similar to Collectors.toSet()
        .count();
    System.out.println(uniqueNameCount); // 3

    // ! The relationship between Intermediate and Terminate Operation
    long employeeCount = employees.stream() //
        .map(e -> {
          System.out.println("hello");
          return e.getSalary();
        }) // ! Didn't execute
        .count();
    System.out.println(employeeCount); // 4

    // ! Java first look up their relationship. If no impact to result, the intermediate action will be skipped.

  }

  public static class Employee {
    private double salary;
    private LocalDate joinDate;
    private String name;
    private int id;

    public Employee(int id, String name, LocalDate joinDate, double salary) {
      this.name = name;
      this.id = id;
      this.joinDate = joinDate;
      this.salary = salary;
    }

    public String getName() {
      return this.name;
    }

    public double getSalary() {
      return this.salary;
    }

    public LocalDate getJoinDate() {
      return this.joinDate;
    }

    public int getId() {
      return this.id;
    }
  }
}