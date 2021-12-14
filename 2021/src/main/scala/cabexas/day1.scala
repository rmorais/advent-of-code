package example

import scala.io.Source

object Day1 extends App {
  def numberOfIncreases(depthReadings: Seq[Int]): Int = {
    depthReadings.zip(depthReadings.tail).count(_ < _)
  }

  def sum(values: Seq[Int]): Int = {
    numberOfIncreases(values.sliding(3).map(_.sum).toList)
  }

  val input = Source.fromResource("day1.txt").getLines.toList.map(_.toInt)
  println(numberOfIncreases(input))
  println(sum(input))
}

