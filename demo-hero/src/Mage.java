
public class Mage extends Hero {
  
  private static final int Starting_level = 0;
  public Mage() {
    super(Starting_level, Heros.maxHp(Heros.MAGE, Starting_level));
  }
  @Override
  public int getRole() {
    return Heros.MAGE;
  }

  // ! presentation
  public int getPa() {
    return Heros.pa(getRole(), super.getLevel());
  }

  // ! presentation
  public boolean isCD() {
    return Math.random() <= Heros.cc(this.getRole(), super.getLevel());
  }

  public double getCD() {
    return this.getPa() * Heros.cdMultipler(this.getRole(), super.getLevel());
  }

  // ! this vs hero
  public void attack(Hero hero) {
    double toBeDeducted = this.isCD() ? this.getCD() : this.getPa();
    hero.deductHp((int)(toBeDeducted));
  }

  public static void main(String[] args) {
    Archer mage = new Archer();
    System.out.println(mage.getHp());
    System.out.println(mage.getPa());

    System.out.println(Math.random()); // 0-1
  }
  Mage mage = new Mage();

}
