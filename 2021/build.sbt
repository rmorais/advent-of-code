import Dependencies._

ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.cabexas"
ThisBuild / organizationName := "cabexas"

lazy val root = (project in file("."))
  .settings(
    name := "adventofcode2021",
    libraryDependencies ++= Seq(cats, catsEffect),
    libraryDependencies ++= Seq(munit, munitCatsEffect).map(_ % Test)

      )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
