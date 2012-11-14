import sbt._
import sbt.Keys._

object DirwatcherBuild extends Build {

  lazy val dirwatcher = Project(
    id = "dir-watcher",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "dir-watcher",
      organization := "net.caoticode.dirwatcher",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.3"
    )
  )
}
