val http4sVersion = "0.8.3"

organization := "ltf"

name := "htmltopdf"

scalaVersion := "2.11.6"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
    "org.http4s" %% "http4s-blazeserver" % http4sVersion,
    "org.http4s" %% "http4s-core" % http4sVersion,
    "org.http4s" %% "http4s-server" % http4sVersion,
    "org.http4s" %% "http4s-dsl" % http4sVersion,
    "org.http4s" %% "http4s-argonaut" % http4sVersion,
    "io.argonaut" %% "argonaut" % "6.0.4",
    "org.scalaz.stream" %% "scalaz-stream" % "0.6a",
    "io.github.cloudify" %% "spdf" % "1.3.1"
  )
