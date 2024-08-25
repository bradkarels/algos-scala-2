package io.rev27
package leet

import scala.annotation.tailrec

object FindTheIndex {
  def strStr(haystack: String, needle: String): Int = {
    doStrStr(haystack, needle.toCharArray)
  }

  @tailrec
  def doStrStr(haystack: String, needle: Array[Char], idx: Int = 0): Int = {
    lazy val head: Char = haystack.head
    val needleLen: Int = needle.length
    if (haystack.length < needleLen) -1
    else if (head == needle(0)) {
      val possibleNeedle = haystack.take(needleLen)
      val y: Seq[Int] =
        for (i <- 0 until needleLen if needle(i) == possibleNeedle(i))
          yield i
      if (y.length == needleLen) idx
      else doStrStr(haystack.tail, needle, idx + 1)
    } else doStrStr(haystack.tail, needle, idx + 1)
  }
}
