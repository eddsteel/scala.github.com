object methodInvocation {
  foo(42, bar)
  target.foo(42, bar)
  target.foo()

  foo(x = 6, y = 7)

  reply()

  // is the same as

  reply

  // recommended
  a + b

  // format: off
  // legal, but less readable
  a+b
  // format:on

  // legal, but definitely strange
  a.+(b)

  // recommended
  names.mkString(",")

  // also sometimes seen; controversial
  names mkString ","

  // fairly common
  a max b

  foo ** (bar, baz)

  // recommended
  names.toList

  // discourage
  names toList

}
