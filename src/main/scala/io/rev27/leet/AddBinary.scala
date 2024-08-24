package io.rev27
package io.rev27.leet

import scala.annotation.tailrec

object AddBinary {
  def addBinary(a: String, b: String): String = {
    doAddBinary(a,b)
  }

  private def mkNext(s: String) = if (s.isEmpty || s.takeRight(1) == "0") None else Some(s.takeRight(1))

  @tailrec
  private def doAddBinary(a: String, b: String, sum: String = "", c: String = ""): String = {
    if ((a.isEmpty && b.isEmpty) && c.isEmpty) sum
    else {
      val aa = mkNext(a)
      val bb = mkNext(b)
      val cc = mkNext(c)
      val digit = (aa, bb, cc)
      digit match {
        case (None, None, None)          => doAddBinary(a.dropRight(1), b.dropRight(1), "0" + sum)
        case (None, None, Some(_))       => doAddBinary(a.dropRight(1), b.dropRight(1), "1" + sum)
        case (Some(_), None, None)       => doAddBinary(a.dropRight(1), b.dropRight(1), "1" + sum)
        case (None, Some(_), None)       => doAddBinary(a.dropRight(1), b.dropRight(1), "1" + sum)
        case (None, Some(_), Some(_))    => doAddBinary(a.dropRight(1), b.dropRight(1), "0" + sum, "1")
        case (Some(_), None, Some(_))    => doAddBinary(a.dropRight(1), b.dropRight(1), "0" + sum, "1")
        case (Some(_), Some(_), None)    => doAddBinary(a.dropRight(1), b.dropRight(1), "0" + sum, "1")
        case (Some(_), Some(_), Some(_)) => doAddBinary(a.dropRight(1), b.dropRight(1), "1" + sum, "1")
      }
    }
  }
}
