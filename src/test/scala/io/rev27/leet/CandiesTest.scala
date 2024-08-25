package io.rev27
package io.rev27.leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CandiesTest extends AnyFlatSpec with should.Matchers {

  behavior of "CandiesTest"

  it should "kidsWithCandies 2,3,5,1,3" in {
    val candies = Array(2, 3, 5, 1, 3)
    val extra = 3
    val expected = Array(true, true, true, false, true)
    val result = Candies.kidsWithCandies(candies, extra)
    result shouldBe expected
  }

  it should "kidsWithCandies 4, 2, 1, 1, 2" in {
    val candies = Array(4, 2, 1, 1, 2)
    val extra = 1
    val expected = Array(true,false,false,false,false)
    val result = Candies.kidsWithCandies(candies, extra)
    result shouldBe expected
  }

  it should "kidsWithCandies 12, 1, 12" in {
    val candies = Array(12, 1, 12)
    val extra = 10
    val expected = Array(true, false, true)
    val result = Candies.kidsWithCandies(candies, extra)
    result shouldBe expected
  }
}
