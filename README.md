scalajs-createjs
===============

Static types for the [CreateJS](http://createjs.com/) API for [Scala.js](http://www.scala-js.org/) programs.

Usage
-----

Add the following to your sbt build definition:

```scala
resolvers += "amateras-repo" at "http://amateras.sourceforge.jp/mvn-snapshot/"

libraryDependencies += "com.scalawarrior" %%% "scalajs-createjs" % "0.0.1-SNAPSHOT"
```
and add an import statement to your Scala.js program.

```scala
import com.scalawarrior.scalajs.createjs._
```

then enjoy CreateJS in Scala.js!
