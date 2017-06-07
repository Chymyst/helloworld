package sample

import io.chymyst.jc._

object HelloWorldChymyst extends App {
  // Define a function that starts some reactions, then call that function.

  def startReactions(): Boolean = {
    val a = m[String]
    val get_status = b[Unit, Boolean]

    site(
      go { case a(message) + get_status(_, reply) => println(message); reply(true) }
    )

    a("Hello, Chymyst lab!")
    val status: Boolean = get_status()
    status
  }

  startReactions()
}
