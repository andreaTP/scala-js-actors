enablePlugins(ScalaJSPlugin)

name := "Scala.js actors"

scalaVersion := "2.11.5"

unmanagedSourceDirectories in Compile += baseDirectory.value / "src" / "main"/ "wscommon"

libraryDependencies += "org.scalajs" %%% "scalajs-pickling" % "0.4-SNAPSHOT"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
//libraryDependencies += "org.scala-lang.modules.scalajs" %% "scalajs-test-bridge" % scalaJSVersion % "test"

testFrameworks += new TestFramework("org.scalajs.actors.test.ActorsTestFramework")