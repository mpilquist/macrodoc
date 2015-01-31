package simulacrum

import org.scalatest.{ WordSpec, Matchers }

class TypeClassTest extends WordSpec with Matchers {

  "the @typeclass annotation" should {

    "support type classes that are polymorphic over a proper type," which {
      @typeclass trait Semigroup[@specialized(Int, Long) A] {
        def append(x: A, y: A): A
      }
    }
  }
}
