scalaVersion := "2.11.5"

name := "Scala.js-Akka Websocket Bridge"

normalizedName := "akka-websocket-bridge"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

unmanagedSourceDirectories in Compile += baseDirectory.value / "src" / "main"/ "wscommon"

resolvers += Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(
    Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.3.9",
    "com.typesafe.play" %% "play" % "2.3.8",
    "org.scalajs" %% "scalajs-pickling-play-json" % "0.4-SNAPSHOT"
)
