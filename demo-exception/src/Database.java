import java.util.ArrayList;
import java.util.List;

// String -> T
public class Database<T> {
  private List<T> values;

  public Database() {
    this.values = new ArrayList<>();
  }

  public boolean add(T t) {
    return this.values.add(t);
  }

  public boolean remove(T t) {
    return this.values.remove(t);
  }

  public boolean search(T t) {
    if (this.values.contains(t)) {
      return true;
    }
    throw new NotFoundException(SysCode.USERNAME_NOT_FOUND);
  }

  public static void main(String[] args) {
    Database<String> userNames = new Database<>();
    userNames.add("johnwong");
    userNames.add("stevechan");
    userNames.add("cherrycheung");

    try {
      userNames.search("leochan");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}