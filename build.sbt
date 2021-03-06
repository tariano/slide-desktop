import sbt.Keys._

lazy val `slide` = (project in file(".")).
settings(
  name := "slide",
  version := "2.56",
  scalaVersion := "2.11.7"
)

compileOrder := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
  "com.android.tools.ddms" % "ddmlib" % "24.3.1",
  "com.google.guava" % "guava" % "18.0",
  "com.miglayout" % "miglayout" % "3.7.4"
)

mainClass in (Compile, run) := Some( "slide.Main")
