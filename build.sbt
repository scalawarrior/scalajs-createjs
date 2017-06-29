lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js CreateJS"

normalizedName := "scalajs-createjs"

version := "0.0.2-SNAPSHOT"

organization := "com.scalawarrior"

scalaVersion := "2.12.2"

//crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.9.2"

//jsDependencies +=
//  "org.webjars" % "jquery" % "2.1.3" / "2.1.3/jquery.js"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"
)

publishTo <<= (version) { version: String =>
  val repoInfo =
    if (version.trim.endsWith("SNAPSHOT"))
      ("amateras snapshots" -> "/home/groups/a/am/amateras/htdocs/mvn-snapshot/")
    else
      ("amateras releases" -> "/home/groups/a/am/amateras/htdocs/mvn/")
  Some(Resolver.ssh(
    repoInfo._1,
    "shell.sourceforge.jp",
    repoInfo._2) as(System.getProperty("user.name"), (Path.userHome / ".ssh" / "id_rsa").asFile) withPermissions("0664"))
}
