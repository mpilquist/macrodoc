package simulacrum

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

class typeclass extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro TypeClassMacros.generateTypeClass
}

object TypeClassMacros {
  def generateTypeClass(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    import c.universe._
    annottees.head
  }
}
