#!/bin/bash

scalafmt --stdout $1 > test.scala
diff test.scala $1
