package sample

import io.chymyst.jc._

object HelloWorldChymyst extends App {
  val a = m[String]
  val get_status = b[Unit, Boolean]

  site(
    go { case a(message) + get_status(_, reply) ⇒ println(message); reply(true) }
  )

  a("Hello, Chymyst lab!")
  get_status() // run reaction and obtain `true` status
}
