package org.example;

public class Monster {
  String name;
  int rare; // 1~4

  Monster() {
    this.name = "aa";
    this.rare = 1;
  }
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
