package sample

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldChymystSpec extends FlatSpec with Matchers {

  behavior of "hello world application"

  it should "start reactions and report final status" in {
    HelloWorldChymyst.result shouldEqual 0 // application did not yet run
    HelloWorldChymyst.main(Array()) // run application
    HelloWorldChymyst.result shouldEqual 123
  }
}
