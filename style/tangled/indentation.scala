object indentation {
  // right!
  class Foo {
    def bar = ???
  }

  val result = 1 + 2 + 3 + 4 + 5 + 6 +
    7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 +
    15 + 16 + 17 + 18 + 19 + 20

  foo(
    someVeryLongFieldName,
    andAnotherVeryLongFieldName,
    "this is a string",
    3.1415)

  // right!
  val myLongFieldNameWithNoRealPoint =
    foo(
      someVeryLongFieldName,
      andAnotherVeryLongFieldName,
      "this is a string",
      3.1415)
}
