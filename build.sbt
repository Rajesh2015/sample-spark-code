name := "sample-spark-code"

version := "0.1"

scalaVersion := "2.12.0"
organization := "io.github"
organizationName := "rajesh2015"
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
publishTo in ThisBuild := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
scmInfo := Some(
  ScmInfo(
    url("https://github.com/Rajesh2015/sample-spark-code"),
    "scm:https://github.com/Rajesh2015/sample-spark-code.git"
  )
)
developers := List(
  Developer("Rajesh", "Rajesh Dash", "dashrajesh49@gmail.com", url("http://rajeshblogs.in"))
)