ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "Test_caching_indexes",
    idePackagePrefix := Some("org.test")
    //values in build.sbt are highlighted too
    //also I added typppo here
  )
