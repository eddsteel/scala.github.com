object declarations {

  // format: off
  // either add a body or use {} on same line.
  class Person(name: String, age: Int) {
  }
  // format: on

  class Person(
      name: String,
      age: Int,
      birthdate: Date,
      astrologicalSign: String,
      shoeSize: Int,
      favoriteColor: java.awt.Color) {
    def firstMethod: Foo = ???
  }

  class Person(
      name: String,
      age: Int,
      birthdate: Date,
      astrologicalSign: String,
      shoeSize: Int,
      favoriteColor: java.awt.Color)
    extends Entity
    with Logging
    with Identifiable
// format: off
// either add a body or use {} on same line
    with Serializable {
  }
// format: on

  class Foo {
    val bar = 42
    val baz = "Daniel"

    def doSomething(): Unit = { ??? }

    def add(x: Int, y: Int): Int = x + y
  }

  def foo(bar: Baz): Bin = expr

  def foo(x: Int = 6, y: Int = 7): Int = x + y

  private def foo(x: Int = 6, y: Int = 7) = x + y

  // don't do this
  def printBar(bar: Baz) {
    println(bar)
  }

  // write this instead
  def printBar(bar: Bar): Unit = {
    println(bar)
  }

  @Transaction
  @throws(classOf[IOException])
  override protected final def foo() {
    ???
  }

  def add(a: Int, b: Int): Int = a + b

  def sum(ls: List[String]): Int =
    ls.map(_.toInt).foldLeft(0)(_ + _)

  def sum(ls: List[String]): Int = {
    val ints = ls map (_.toInt)
    ints.foldLeft(0)(_ + _)
  }

  // right!
  def sum(ls: List[Int]): Int = ls match {
    case hd :: tail => hd + sum(tail)
    case Nil => 0
  }

  // format: off
  // no config option for aligning multiple argument lists
  protected def forResource(resourceInfo: Any)
                           (f: (JsonNode) => Any)
                           (implicit urlCreator: URLCreator, configurer: OAuthConfiguration): Any = {
    ???
  }
  // format:on

  def foldLeft[A, B](ls: List[A])(init: B)(f: (B, A) => B): B = ???

  foldLeft(List(1, 2, 3, 4))(0)(_ + _)

  private lazy val foo = bar()

  val f1 = { (a: Int, b: Int) =>
    val sum = a + b
    sum
  }

}
