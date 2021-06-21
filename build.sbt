name := "sample-spark-code"

//crossPaths := false
homepage := Some(url("https://github.com/Rajesh2015/sample-spark-code"))
licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
scalaVersion := "2.11.8"
organization := "io.github.rajesh2015"
organizationName := "io.github.rajesh2015"
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
publishTo in ThisBuild := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"

scmInfo := Some(
  ScmInfo(
    url("https://github.com/Rajesh2015/sample-spark-code"),
    "scm:https://github.com/Rajesh2015/sample-spark-code.git"
  )
)
developers := List(
  Developer("Rajesh", "Rajesh Dash", "dashrajesh49@gmail.com", url("http://rajeshblogs.in"))
)
