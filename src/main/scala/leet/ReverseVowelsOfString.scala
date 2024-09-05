package io.rev27
package leet

import scala.collection.mutable.ArrayBuffer

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 *
 * Example 2:
 *
 * Input: s = "leetcode"
 * Output: "leotcede"
 *
 * Constraints:
 * 1 <= s.length <= 3 * 105
 * s consist of printable ASCII characters.
 */
object ReverseVowelsOfString {

  def isVowel(c: Char): Boolean = {
    c match {
      case 'a' => true
      case 'e' => true
      case 'i' => true
      case 'o' => true
      case 'u' => true
      case 'A' => true
      case 'E' => true
      case 'I' => true
      case 'O' => true
      case 'U' => true
      case _ => false
    }
  }

  def reverseVowels(s: String): String = {
    var l = 0
    var r = s.length-1
    lazy val res = s.to(ArrayBuffer)
    var lIsVowel = isVowel(res(l))
    var rIsVowel = isVowel(res(r))
    while (l < r) {
      if (lIsVowel && rIsVowel) {
        val charAtR = res(r)
        res(r) = res(l)
        res(l) = charAtR
        l = l + 1
        lIsVowel = isVowel(res(l))
        r = r - 1
        rIsVowel = isVowel(res(r))
      } else if (lIsVowel && !rIsVowel) {
        r = r - 1
        rIsVowel = isVowel(res(r))
      } else if (!lIsVowel && rIsVowel) {
        l = l + 1
        lIsVowel = isVowel(res(l))
      } else {
        l = l + 1
        lIsVowel = isVowel(res(l))
        r = r - 1
        rIsVowel = isVowel(res(r))
      }
    }
    res.mkString("")
  }
}
