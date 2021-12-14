package example

import Day1.numberOfIncreases
class Day1Suite extends munit.FunSuite {
  test("sample_input") {
    val input = List(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    assertEquals(numberOfIncreases(input), 7)
  }
}
