package $organization$

import org.scalatest.{BeforeAndAfter, FunSpec}

object  $name;format="Camel"$ extends App {
  println("Hello, $name$")
}



class $name;format="Camel"$UnitTest extends FunSpec with BeforeAndAfter {

  var thing: AnyRef = _
  before{
    thing = "foo" 
  }
  describe("thing"){
    it("should be equal to foo"){
      assert(thing == "foo")
    }
  }
}
