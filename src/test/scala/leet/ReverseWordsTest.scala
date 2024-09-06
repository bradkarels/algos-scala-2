package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ReverseWordsTest extends AnyFlatSpec with should.Matchers {

  behavior of "ReverseWordsTest"

  it should "reverseWords" in {
    val s = "the sky is blue"
    val expected = "blue is sky the"
    val result = ReverseWords.reverseWords(s)
    result shouldBe expected
  }

  it should "reverseWords - 1" in {
    val s = "  hello world  "
    val expected = "world hello"
    val result = ReverseWords.reverseWords(s)
    result shouldBe expected
  }

  it should "reverseWords - 2" in {
    val s = "a good   example"
    val expected = "example good a"
    val result = ReverseWords.reverseWords(s)
    result shouldBe expected
  }
}
