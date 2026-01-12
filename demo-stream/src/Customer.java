import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
  private List<Address> addresses;

  public Customer() {
    this.addresses = new LinkedList<>();
  }

  public void add(Address address) {
    this.addresses.add(address);
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.add(new Address("abc", "def"));
    c1.add(new Address("xxx", "sss"));

    Customer c2 = new Customer();
    c2.add(new Address("bbb", "aaa"));
    c2.add(new Address("mmm", "nnn"));
    c2.add(new Address("ccc", "ddd"));

    List<Customer> customers = new ArrayList<>();
    customers.add(c1);
    customers.add(c2);

    
    // Many Customers have many address.
    // ! Find all addresses -> List<Address>

    // ! Approach 1: FlatMap
    List<Address> addresses = customers.stream() //
        .flatMap(e -> e.getAddresses().stream()) //
        // ! For using FlatMap, list.stream()
        .collect(Collectors.toList());

    System.out.println(addresses);

    System.out.println(c2.getAddresses().get(1).getLine()); // mmm

    // ! Approach 2: Loop
    List<Address> addressList = new ArrayList<>();
    for (Customer customer : customers) {
      for (Address address : customer.getAddresses()) {
        addressList.add(address);
      }
    }
  }
}