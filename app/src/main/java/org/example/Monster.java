package org.example;

public class Monster {
  String name;
  int rare; // 1~4

  Monster() {
  }
  
  public String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }


}
