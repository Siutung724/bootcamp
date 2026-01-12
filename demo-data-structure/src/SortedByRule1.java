import java.util.Comparator;

public class SortedByRule1 implements Comparator<Person> {
  // PROGRAMMER -> POLICEMAN -> CLERK
  // if same occupation, sort by age decending
  @Override
  public int compare(Person p1, Person p2) {
    // return p1 -> -1
    // return p2 -> 1
    if (p1.getOccupation() == p2.getOccupation()) {
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
    if (p1.getOccupation() == Person.Occupation.PROMGRAMMER)
      return -1;
    if (p2.getOccupation() == Person.Occupation.PROMGRAMMER)
      return 1;
    if (p1.getOccupation() == Person.Occupation.POLICEMAN)
      return -1;
    if (p2.getOccupation() == Person.Occupation.POLICEMAN)
      return 1;
    return 1;
  }
}