object nestedBlocks {
  def foo = {
    ???
  }

  (this + is a very ++ long *
    expression)

  // format: off
  // this is said to allow operators and parentheses to align
  // but doesn't seem very standard.
  (  someCondition
  || someOtherCondition
  || thirdCondition
  )
  // format: on
}
