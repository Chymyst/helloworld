# helloworld

This project shows a minimal "hello, world" Chymyst application.

This application depends on `joinrun.jar` as an unmanaged dependency in the `lib/` directory.

The code defines a reaction that prints a message (asynchronously) and returns a status value through a blocking molecule.

## Compile

`sbt compile`

## Run

`sbt run`

This should print a message to the console.

## Run unit tests

`sbt test`
