package scaladoc {
// format: off
// this isn't a recognised style.
  object one {
    /** This is a brief description of what's being documented.
     *
     *  This is further documentation of what we're documenting.  It should
     *  provide more details as to how this works and what it does.
     */
    def myMethod = {}

    /** Does something very simple */
    def simple = {}
  }

  /** This is the Scaladoc for the package. */
  package object mypackage {
  }

  /** Provides classes for dealing with complex numbers.  Also provides
   *  implicits for converting to and from `Int`.
   *
   *  ==Overview==
   *  The main class to use is [[my.package.complex.Complex]], as so
   *  {{ "{{{" }}
   *  scala> val complex = Complex(4,3)
   *  complex: my.package.complex.Complex = 4 + 3i
   *  }}}
   *
   *  If you include [[my.package.complex.ComplexConversions]], you can
   *  convert numbers more directly
   *  {{ "{{{" }}
   *  scala> import my.package.complex.ComplexConversions._
   *  scala> val complex = 4 + 3.i
   *  complex: my.package.complex.Complex = 4 + 3i
   *  }}}
   */
  package complex {}

  /** A person who uses our application.
   *
   *  @constructor create a new person with a name and age.
   *  @param name the person's name
   *  @param age the person's age in years
   */
  class Person(name: String, age: Int) {
  }

  /** Factory for [[mypackage.Person]] instances. */
  object Person {
    /** Creates a person with a given name and age.
     *
     *  @param name their name
     *  @param age the age of the person to create
     */
    def apply(name: String, age: Int) = {}

    /** Creates a person with a given name and birthdate
     *
     *  @param name their name
     *  @param birthDate the person's birthdate
     *  @return a new Person instance with the age determined by the
     *          birthdate and current date.
     */
    def apply(name: String, birthDate: java.util.Date) = {}
  }

  /** Implicit conversions and helpers for [[mypackage.Complex]] instances.
   *
   *  {{ "{{{" }}
   *  import ComplexImplicits._
   *  val c: Complex = 4 + 3.i
   *  }}}
   */
  object ComplexImplicits {}
//format: on
}
