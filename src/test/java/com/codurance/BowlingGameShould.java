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
    rollMany(20, 0);

    assertEquals(0, bowlingGame.score());
  }

  @Test
  void return_20_for_all_ones() {
    rollMany(20, 1);
    assertEquals(20, bowlingGame.score());
   }

  @Test
  void return_sixteen_for_one_spare_and_one_three_roll() {
    rollSpare();
    bowlingGame.roll(3);

    rollMany(17, 0);

    assertEquals(16, bowlingGame.score());
  }

  @Test
  void return_24_for_strike_and_3_4_in_next_frame() {
    rollStrike();
    bowlingGame.roll(3);
    bowlingGame.roll(4);

    rollMany(16, 0);

    assertEquals(24, bowlingGame.score());
  }

  private void rollStrike() {
    bowlingGame.roll(10);
  }

  private void rollSpare() {
    bowlingGame.roll(5);
    bowlingGame.roll(5);
  }

  private void rollMany(int rolls, int pins) {
    for (int i = 0; i < rolls; i++) {
      bowlingGame.roll(pins);
    }
  }
}
