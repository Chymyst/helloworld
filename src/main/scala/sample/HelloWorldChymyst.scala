package sample

import io.chymyst.jc._

object HelloWorldChymyst extends App {
  val a = m[String]
  val get_value = b[Unit, Int]

  site(
    go { case a(message) + get_value(_, reply) ⇒
      reply(123)
      println(message)
    }
  )

  a("Hello, Chymyst lab!")

  val result = get_value() // run reaction and obtain result as the reply value
}
