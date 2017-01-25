name := "helloworld"

organization := "sample"

version := "0.0.1"

scalaVersion in ThisBuild := "2.11.8"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "io.chymyst" %% "core" % "latest.integration",
  // The dependency on scala-compiler is required only for debugging the compiler during macro expansion.
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "test"
)
