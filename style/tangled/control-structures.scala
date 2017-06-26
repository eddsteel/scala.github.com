object control {
  // right!
  if (foo) bar else baz
  for (i <- 0 to 10) { ??? }
  while (true) { println("Hello, World!") }

  // format: off
  // no config to allow if before indenting
  val news = if (foo)
    goodNews()
  else
    badNews()
  // format: on

  if (foo) {
    println("foo was true")
  }

  news match {
    case "good" => println("Good news!")
    case "bad" => println("Bad news!")
  }

  // right!
  for {
    x <- board.rows
    y <- board.files
  } yield (x, y)

  // right!
  for (x <- board.rows; y <- board.files) {
    printf("(%d, %d)", x, y)
  }

  val res = if (foo) bar else baz

}
