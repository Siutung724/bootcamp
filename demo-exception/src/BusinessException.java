// ! Java: Exception Class or Normal Class
// Exception.class has an attribute, called "message"

// 1. Unchecked Expcetion (Parent -> RunetimeException.class)
// Java Built-in RuntimeException: ArrayIndexOutOfBound,... etc
// Compile-time has NO checking for RuntimeException

// 2. Checked Exception (Parent -> Exception.class)
// throw checked exception object, method signature has "throws"
// method callers has to try-catch for recovery
public class BusinessException extends Exception { // ! checked exception
  private int code;

  public static BusinessException of(SysCode sysCode) {
    return new BusinessException(sysCode);
  }

  public BusinessException(SysCode sysCode) {
    super(sysCode.getMessage());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return this.code;
  }

  public static void main(String[] args) {

    // fullName("John", "Wong"); // unhandled Exception (Requires try-catch for checked exception)
    try {
      fullName("Steve", "Lau");
    } catch (BusinessException e) {

    }

    int[] arr = new int[] {3, 4};
    System.out.println(arr[-1]); // runtime exception, try-catch is not required


  }

  public static String fullName(String firstName, String lastName)
      throws BusinessException {
    if (firstName == null || lastName == null)
      throw BusinessException.of(SysCode.NULL_PARAM);
    return firstName + " " + lastName;
  }

}