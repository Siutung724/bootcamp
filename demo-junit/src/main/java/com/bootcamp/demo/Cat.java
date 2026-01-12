package com.bootcamp.demo;

import java.util.Optional;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Customer -> Orders -> Items
// Item -> Order -> Customer

// ! Developer A (depends on Developer B)

// ! Required a tool to test Cat, without completing Gun development

@ToString
@EqualsAndHashCode
public class Cat {
  @Setter
  private Gun gun;
  @Getter // ! isAlive()
  private boolean isAlive; // fasle

  public Cat() {
    this.isAlive = true;
  }

  public void clearBullet() {
    if (this.gun != null) {
      this.gun.clearBullet();
    }
  }

  // APIE
  public Optional<Integer> checkBullet() {
    if (this.gun != null) {
      return Optional.of(this.gun.getBullet());
    }
    return Optional.empty(); // ! Optional Object
  }

  public void beingkilled() {
    this.isAlive = false;
  }

  public void attack(Cat targetCat) {
    if (this.gun == null || !this.isAlive)
      return;
    if (this.gun.shoot()) {
      targetCat.beingkilled();
    }
  }

}