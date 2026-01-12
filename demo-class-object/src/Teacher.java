public class Teacher {
  private Candy[] candies;

  public Teacher() {
    this.candies = new Candy[0];
  }

  public void add(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = newCandy;
    this.candies = newCandies;
  }

  public void add(Candy[] candies) {
    for (Candy candy : candies) {
      this.add(candy);
    }
  }

  public void distribute(Student student) {
    // ! Teacher object don't even know how student store the candies
    Candy candy = this.deductCandy();
    if (candy != null) {
      student.receive(candy);
    }
  }

  public void distributeAll(Student[] students) {
    int idx = 0;
    while(true) {
      Candy candy = this.deductCandy();
      if (candy == null)
        break;
      idx = idx % students.length == 0 ? 0 : idx;
      students[idx++].receive(candy);
    }
  }

  public Candy deductCandy() {
    if (this.candies.length <= 0)
      return null;
    Candy deductedCandy = this.candies[this.candies.length - 1];
    Candy[] newCandies = new Candy[this.candies.length - 1];
    for (int i = 0; i < this.candies.length - 1; i++) {
      newCandies[i] = this.candies[i];
    }
    this.candies = newCandies;
    return deductedCandy;
  }


  // A Teacher has 22 candies
  // 5 students
  // main: "distribute" all candies to all students
  // Finally, teacher has no candies
  // Show all candies for each student.

  public static void main(String[] args) {
    // new Candy("RED") -> private constructor
    Candy[] candies = new Candy[] {Candy.ofRed(), Candy.ofRed(), Candy.ofRed(),
        Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), //
        Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(),
        Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), //
        Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(),
        Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), //
    };
    System.out.println(candies.length);

    //

  }
}