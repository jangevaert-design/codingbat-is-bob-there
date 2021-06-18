package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatIsBobThereTest {

  private String[] bobParams = {
      "abcbob",
      "b9b",
      "bac",
      "bbb",
      "abcdefb",
      "123abcbcdbabxyz",
      "b12",
      "b1b",
      "b12b1b",
      "bbc",
      "bbb",
      "bb",
      "b"
  };

  private boolean[] bobExpected = {true, true, false, true, false, true, false, true, true, false, true,
  false, false};


  @Test
  void bobTest() {
    for (int i = 0; i < bobParams.length; i++) {
      boolean actual = CodingBatIsBobThere.bobThere(bobParams[i]);
      Assertions.assertEquals(actual, bobExpected[i]);

    }
  }

}

