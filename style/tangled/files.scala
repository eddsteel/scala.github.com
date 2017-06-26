package com.novell.coolness

class Inbox {}

// companion object
object Inbox {}

sealed trait Option[+A]

case class Some[A](a: A) extends Option[A]

case object None extends Option[Nothing]
