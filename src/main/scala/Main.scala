//> using dep org.jetbrains::annotation:4.2.42

import org.test.ScalaObject

import scala.collection.mutable._
import java.util.TreeMap
//rendered scaladoc

/**
 * ScalaDoc comment: <code>Some code</code>
 * Html escape sequence &#94;
 * ''Text''
 * @param x Int param
 * @author IntelliJ
 */
class ScalaClass(x: Int) extends ScalaObject {
  1 to 5
  (x: Int) => x
  val field = "Some\nString\n" //highlighted val and string
  def foo(x: Float, y: Float) = {
    def empty = 2
    val local = 1000 - empty
    Math.sqrt(x + y + local); //this can crashhhh typo error
    error unknown stuff //error 1
    var x: Int="dfsdfs"  //error 2
  }
  def t[T] = null
  foo(0, -1) match {
    case x => x
  } //foo should be folded
  type G = Int
  val xml = <element attibute="value">data</element>
  
}

object Object {
  val layer = -5.0
  val mutableCollection = HashMap[Int,  Int]()
  val immutableCollection = List(1, 2)
  val javaCollection = new TreeMap[Int,  Int]()

  def foo: ScalaClass = new ScalaClass(23)
}

