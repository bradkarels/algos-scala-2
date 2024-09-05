package io.rev27
package leet

import scala.annotation.tailrec

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be
 * planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false
 * otherwise.
 */
object CanPlaceFlowers {
  def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
    if (n == 0) true
    else {
      val fbl = flowerbed.length
      if (fbl == 0) false
      else if (fbl == 1) flowerbed(0) + n < 2
      else {
        if (flowerbed(0)+flowerbed(1) == 0) dcpf(flowerbed.tail, n-1)
        else dcpf(flowerbed, n)
      }
    }
  }

  // TODO: Can be faster with IDXs
  @tailrec
  def dcpf(fb: Array[Int], n: Int): Boolean = {
    if (n == 0) true
    else {
      fb.length match {
        case 0 => false // n must be > 0
        case 1 => false // n must be > 0
        case 2 => // last 2
          if (fb(0) + fb(1) == 0) dcpf(Array.emptyIntArray, n-1)
          else dcpf(Array.emptyIntArray, n)
        case _ =>
          if (fb(0)+fb(1)+fb(2) == 0) dcpf(fb.tail.tail, n-1)
          else dcpf(fb.tail, n)
      }
    }
  }
}
