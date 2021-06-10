package com.yxt.jing.scalabasic
/**
 *
 * scala basic operations
 *
 * @author jingwz
 * @version 1.0
 * @date 2021-06-10 11:13
 */
object ScalaBasic {
  def main(args: Array[String]): Unit = {
    println("this is the first scala")

    val salary = 20000
    val name = "king"

    println(s"name=$name salary=${salary + 5000}")


    val sql =
      """
        |select name
        |from
        |t
        |where t.id = {}
        |""".stripMargin

    println(s"sql=$sql")

    val double = 2.1d
    println(double)

  }

}
