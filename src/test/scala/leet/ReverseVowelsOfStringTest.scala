package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ReverseVowelsOfStringTest extends AnyFlatSpec with should.Matchers {

  behavior of "ReverseVowelsOfStringTest"

  it should "reverseVowels - 0" in {
    val s = "hello"
    val expected = "holle"
    val result = ReverseVowelsOfString.reverseVowels(s)
    result shouldBe expected
  }

  it should "reverseVowels - 1" in {
    val s = "leetcode"
    val expected = "leotcede"
    val result = ReverseVowelsOfString.reverseVowels(s)
    result shouldBe expected
  }

  it should "reverseVowels - 2" in {
    val s = "xaxexixoxu"
    val expected = "xuxoxixexa"
    val result = ReverseVowelsOfString.reverseVowels(s)
    result shouldBe expected
  }

  it should "reverseVowels - 3" in {
    val s = "aA"
    val expected = "Aa"
    val result = ReverseVowelsOfString.reverseVowels(s)
    result shouldBe expected
  }
}
