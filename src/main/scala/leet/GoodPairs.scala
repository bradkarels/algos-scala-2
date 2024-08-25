package io.rev27
package leet

import scala.annotation.tailrec

/**
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 *
 * Example 1:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 * Example 2:
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 *
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: 0
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * Accepted
 */
object GoodPairs {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    getPairs(nums).length
  }

  @tailrec
  private def getPairs(nums: Array[Int], pairs: Array[(Int,Int)] = Array.empty): Array[(Int,Int)] = {
    if (nums.isEmpty) pairs
    else {
      val head = nums.head
      val all: Array[(Int, Int)] = nums.tail.map { (head, _) }
      val p = all.filter { t => t._1 == t._2 }
      getPairs(nums.tail, pairs ++ p)
    }
  }
}
