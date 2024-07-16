package org.example;

import com.google.common.base.Strings;

public class Monster {
  String name;
  int rare; // 1~4

  Monster() {
    this.name = "aa";
    this.rare = 3;
  }

  public String print() {
    return megaEvolution();
  }

  public String megaEvolution() {
    if (this.rare <= 2) {
      return this.name;
    } else {
      return "メガ" + this.name;
    }
  }

}
