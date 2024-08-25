package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class AddBinaryTest extends AnyFlatSpec with should.Matchers {

  behavior of "AddBinaryTest"

  it should "addBinary 11 + 1 = 100" in {
    val a = "11"
    val b = "1"
    val expected = "100"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }

  it should "addBinary 1010 + 1011 = 10101" in {
    val a = "1010"
    val b = "1011"
    val expected = "10101"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }

  it should "addBinary 111 + 111 = 1110" in {
    val a = "111"
    val b = "111"
    val expected = "1110"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }

  it should "addBinary 111 + 11 = 1010" in {
    val a = "111"
    val b = "11"
    val expected = "1010"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }

  it should "addBinary 1 + 1 = 10" in {
    val a = "1"
    val b = "1"
    val expected = "10"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }

  it should "addBinary 101010101 + 1 = 101010110" in {
    val a = "101010101"
    val b = "1"
    val expected = "101010110"
    val result = AddBinary.addBinary(a,b)
    result shouldBe expected
  }
}
