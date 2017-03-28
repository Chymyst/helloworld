name := "helloworld"

organization := "sample"

version := "0.0.1"

scalaVersion in ThisBuild := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "io.chymyst" %% "chymyst-core" % "latest.integration"
)
