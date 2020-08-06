package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameShould {

  private BowlingGame bowlingGame;

  @BeforeEach
  void setUp() {
    bowlingGame = new BowlingGame();
  }

  @Test
  void return_0_for_gutter_game() {
    rollMany(0, 20);

    assertEquals(0, bowlingGame.score());
  }

  @Test
  void return_20_for_all_ones() {
    rollMany(1, 20);
    assertEquals(20, bowlingGame.score());
  }

  private void rollMany(int pins, int rolls) {
    for (int i = 0; i < rolls; i++) {
      bowlingGame.roll(pins);
    }
  }
}
