import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Event {
  private Importance importance;
  private LocalDateTime eventDate; // isBefore

  public Event(Importance importance) {
    this.importance = importance;
  }

  public Importance getImportance() {
    return this.importance;
  }

  public static enum Importance {
    HIGH, MEDIUM, LOW,;
  }

  public static class SortByImportance implements Comparator<Event> {
    @Override
    public int compare(Event e1, Event e2) {
      if (e1.getImportance() == Importance.HIGH)
        return -1;
      if (e2.getImportance() == Importance.HIGH)
        return 1;
      if (e1.getImportance() == Importance.MEDIUM)
        return -1;
      if (e2.getImportance() == Importance.MEDIUM)
        return 1;
      return -1;
    }
  }

  public static void main(String[] args) {
    // Comparator: HIGH -> MEDIUM -> LOW
    PriorityQueue<Event> eventQueue =
        new PriorityQueue<>(new SortByImportance());
    eventQueue.add(new Event(Importance.LOW));
    eventQueue.add(new Event(Importance.HIGH));
    eventQueue.add(new Event(Importance.MEDIUM));
    eventQueue.add(new Event(Importance.HIGH));

    System.out.println(eventQueue.poll().getImportance()); // HIGH
    System.out.println(eventQueue.poll().getImportance()); // HIGH
    System.out.println(eventQueue.poll().getImportance()); // MEDIUM
    System.out.println(eventQueue.poll().getImportance()); // LOW

    ArrayList<Event> events = new ArrayList<>();
    // ...
    // ...
    Collections.sort(events, new SortByImportance());
  }
}