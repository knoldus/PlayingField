name := """PlayingField"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( ws, jdbc, anorm, cache, "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23" ) 

org.scalastyle.sbt.ScalastylePlugin.Settings
