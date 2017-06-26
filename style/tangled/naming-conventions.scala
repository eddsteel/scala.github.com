package namingConventions {
  class MyFairLady

  object ast {
    sealed trait Expr

    case class Plus(e1: Expr, e2: Expr) extends Expr
  }

  object inc {
    def apply(x: Int): Int = x + 1
  }

  // right! puts only coolness._ in scope
  package com.novell.coolness {}

  // right! puts both novell._ and coolness._ in scope
  package com.novell {}
  package coolness {}

  // right, for package object com.novell.coolness
  package com.novell {}

  // format: off
  // provide a body or put {} on one line.
  /**
    * Provides classes related to coolness
    */
  package object coolness {
  }
  // format: on

  import _root_.net.liftweb._

  object namingConventions {
    def myFairMethod = ???

    class Company {
      private var _name: String = _

      def name = _name

      def name_=(name: String) {
        _name = name
      }
    }

    class Company {
      val string: Property[String] = Property("Initial Value")
    }

    def foo1() = ???

    def foo2 = ???

    // doesn't change state, call as birthdate
    def birthdate = firstName

    // updates our internal state, call as age()
    def age() = {
      _age = updateAge(birthdate)
      _age
    }

    object Container {
      val MyConstant = ???
    }

    val myValue = ???
    def myMethod = ???
    var myVariable = ???

    class List[A] {
      def map[B](f: A => B): List[B] = ???
    }

    // Right
    class Map[Key, Value] {
      def get(key: Key): Value
      def put(key: Key, value: Value): Unit
    }

    // Wrong; don't use all-caps
    class Map[KEY, VALUE] {
      def get(key: KEY): VALUE
      def put(key: KEY, value: VALUE): Unit
    }

    class Map[K, V] {
      def get(key: K): V
      def put(key: K, value: V): Unit
    }

    class HigherOrderMap[Key[_], Value[_]] { ??? }

    def doSomething[M[_]: Monad](m: M[Int]) = ???

    class cloneable extends StaticAnnotation

    type id = javax.persistence.Id @annotation.target.field
    @id
    var id: Int = 0

    def add(a: Int, b: Int) = a + b
  }
}
