name := """life-calendar"""

version := "0.1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.3.7-1",
  "org.webjars" % "angularjs" % "1.5.7",
  "org.webjars" % "react" % "15.2.1",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)