package io.rev27
package leet

import scala.annotation.tailrec

object Candies {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.max
    rKidsWithCandies(candies, extraCandies, max)
  }

  @tailrec
  private def rKidsWithCandies(candies: Array[Int] = Array.emptyIntArray, extraCandies: Int = 0, max: Int, result: Array[Boolean] = Array.emptyBooleanArray): Array[Boolean] = {
    if (candies.isEmpty) result
    else {
      val nbr = candies.head
      val canHaveMost = nbr + extraCandies >= max
      rKidsWithCandies(candies.tail, extraCandies, max, result :+ canHaveMost)
    }
  }
}
