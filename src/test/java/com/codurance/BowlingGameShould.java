package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BowlingGameShould {

  @Test
  void return_0_for_gutter_game() {
    BowlingGame bowlingGame = new BowlingGame();

    for(int i = 0; i < 20; i++){
      bowlingGame.roll(0);
    }

    assertEquals(0, bowlingGame.score());
  }
}
