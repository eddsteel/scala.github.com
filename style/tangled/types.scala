object types {
  private val name = "Daniel"

  val ls: List[String] = ???
  ls map (str => str.toInt)

  value: Type

  value :::

  def foo(f: Int => String) = ???

  def bar(f: (Boolean, Double) => List[String]) = ???

  def map[B](f: A => B) = ???

  // right!
  def foo(f: Int => String => Boolean => Double) = ???

  // right!
  private type FooParam = {
    val baz: List[String => String]
    def bar(a: Int, b: Int): String
  }

  def foo(a: FooParam) = ???

  def foo(a: { val bar: String }) = ???
}
