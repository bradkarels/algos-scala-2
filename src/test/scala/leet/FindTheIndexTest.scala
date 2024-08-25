package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FindTheIndexTest extends AnyFlatSpec with should.Matchers {

  behavior of "FindTheIndexTest"

  it should "strStr 0" in {
    val haystack = "sadbutsad"
    val needle = "sad"
    val expected = 0
    val result = FindTheIndex.strStr(haystack, needle)
    expected shouldBe result
  }

  it should "strStr 1" in {
    val haystack = "leetcode"
    val needle = "leeto"
    val expected = -1
    val result = FindTheIndex.strStr(haystack, needle)
    expected shouldBe result
  }

  it should "strStr 2" in {
    val haystack = ("leetcode" * 5) + "floof" + "abcdefg"
    val needle = "floof"
    val expected = 40
    val result = FindTheIndex.strStr(haystack, needle)
    expected shouldBe result
  }

  it should "strStr 3" in {
    val haystack = ("leetcode" * 500) + "floof" + ("abcdefg" * 500)
    val needle = "floof"
    val expected = 4000
    val result = FindTheIndex.strStr(haystack, needle)
    expected shouldBe result
  }

  it should "strStr 4" in {
    val haystack = ("abcdefg" * 500) + "gfedcba" + ("abcdefg" * 500)
    val needle = "amanaplanacanalpanama"
    val expected = -1
    val result = FindTheIndex.strStr(haystack, needle)
    expected shouldBe result
  }
}
