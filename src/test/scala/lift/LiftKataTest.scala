package lift

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LiftKataTest extends AnyFlatSpec with should.Matchers {

  "A lift" should "go up from the ground floor on which it starts"
  var lift = new LiftKata
  val capacity = 5
  val queue: Array[Array[Int]] = Array(Array(0),Array(0),Array(5,5,5),Array(0),Array(0),Array(0),Array(0))

  val output: Array[Int] = Array(0,2,5,0)
  for (q <- queue) {
    println(q.mkString(","))
  }
  lift.calculatePath(queue, capacity) should(equal(output))


}
