package io.rev27
package leet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CanPlaceFlowersTest extends AnyFlatSpec with should.Matchers {

  behavior of "CanPlaceFlowersTest"

  it should "canPlaceFlowers 1" in {
    val flowerbed = Array[Int](1,0,0,0,1)
    val n = 1
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 2" in {
    val flowerbed = Array[Int](1,0,0,0,1)
    val n = 2
    val expected = false
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 3" in {
    val flowerbed = Array[Int](1,0,0,0,1,0,0)
    val n = 2
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 4" in {
    val flowerbed = Array[Int](0,0,1,0,0,0,1,0,0)
    val n = 3
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 5" in {
    val flowerbed = Array[Int](0,0,1,0,0,0,1,0,0)
    val n = 4
    val expected = false
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 6" in {
    val flowerbed = Array[Int](1,0,0,0,0,1)
    val n = 2
    val expected = false
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 7" in {
    val flowerbed = Array[Int](1)
    val n = 1
    val expected = false
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 8" in {
    val flowerbed = Array[Int](0)
    val n = 1
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }

  it should "canPlaceFlowers 9" in {
    val flowerbed = Array[Int](1,0,0,0,0)
    val n = 2
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }
//  flowerbed = []
//  n = 0

  it should "canPlaceFlowers 10" in {
    val flowerbed = Array[Int](0,0,0,0,0,1,0,0)
    val n = 0
    val expected = true
    val result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n)
    result shouldBe expected
  }
}
