import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // 66, 40, 30, 20
    // List.of() -> Java 11
    List<Person> persons = new ArrayList<>(List.of(new Person(66),
        new Person(40), new Person(30), new Person(20)));

    // Find a list of Elderly (return a new list)
    List<Person> elderlyPersons = new ArrayList<>();
    for (Person p : persons) {
      if (p.isElderly()) {
        elderlyPersons.add(p);
      }
    }
    System.out.println(elderlyPersons);

    // ! Stream
    Predicate<Person> elderlyFormula = p -> p.getAge() > 65;

    List<Person> elderlyList = persons.stream() // return Stream<Person>
        .filter(elderlyFormula) // return Stream<Person>
        .collect(Collectors.toList()); // return List<Person> (new ArrayList Object)

    System.out.println(elderlyList);
    System.out.println(persons); // ! No change

    // John 10, Sally 3, Leo 8, Steven 5
    Cat c1 = Cat.builder().age(10).name("John").build();
    Cat c2 = Cat.builder().age(3).name("Sally").build();
    Cat c3 = Cat.builder().age(8).name("Leo").build();
    Cat c4 = Cat.builder().age(5).name("Steven").build();

    List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3, c4));

    // Find a new list of cat, whose age > 4 and the name has char 'n'
    List<Cat> targetCats = cats.stream() //
        .filter(c -> c.getAge() > 4 && c.getName().contains("n"))
        .collect(Collectors.toList());
    System.out.println(targetCats);

    // Ball
    // RED 10, BLUE 3, RED 12, YELLOW 8, BLUE 4
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Ball.Color.RED));
    balls.add(new Ball(3, Ball.Color.BLUE));
    balls.add(new Ball(12, Ball.Color.RED));
    balls.add(new Ball(8, Ball.Color.YELLOW));
    balls.add(new Ball(4, Ball.Color.BLUE));

    // ! List<Ball> to List<Ball>
    // ! Find all blue and yellow balls
    List<Ball> targetBalls = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .collect(Collectors.toList());
    System.out.println(targetBalls);

    // ! Find all balls with blue and yellow color. Return the number of the balls.
    // ! List<Ball> to List<Integer>
    List<Integer> targetNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .collect(Collectors.toList());
    System.out.println(targetNumbers); // [3, 8, 4]

    // sort() (Collections.sort(), Arrays.sort())

    List<Integer> targetSortNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .sorted() // ! natural order
        .collect(Collectors.toList());

    System.out.println(targetSortNumbers); // [3, 4, 8]

    // Descending Order (Comparator)

    List<Integer> targetSortDescNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .sorted((n1, n2) -> n1 > n2 ? -1 : 1) //
        .collect(Collectors.toList());

    System.out.println(targetSortDescNumbers); // [8, 4, 3]
  }
}