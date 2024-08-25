package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class GoodPairsTest extends AnyFlatSpec with should.Matchers {

  behavior of "GoodPairsTest"

  it should "getPairs 0" in {
    val n = Array(1, 2, 3, 1, 1, 3)
    val expected = 4
    val result = GoodPairs.numIdenticalPairs(n)
    result shouldBe expected
  }

  it should "getPairs 1" in {
    val n = Array(1, 1, 1, 1)
    val expected = 6
    val result = GoodPairs.numIdenticalPairs(n)
    result shouldBe expected
  }

  it should "getPairs 2" in {
    val n = Array(1,2,3)
    val expected = 0
    val result = GoodPairs.numIdenticalPairs(n)
    result shouldBe expected
  }
}
