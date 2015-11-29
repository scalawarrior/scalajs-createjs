scalajs-createjs
===============

Static types for the [CreateJS](http://createjs.com/) API for [Scala.js](http://www.scala-js.org/) programs.

Usage
-----

Add the following to your sbt build definition:

```scala
resolvers += "amateras-repo" at "http://amateras.sourceforge.jp/mvn/"

libraryDependencies += "com.scalawarrior" %%% "scalajs-createjs" % "0.0.2"
```
and add following import statement to the head of your Scala.js program:

```scala
import com.scalawarrior.scalajs.createjs._
```

then enjoy CreateJS in Scala.js!

```scala
// Declare the stage
val stage = new Stage("demoCanvas")
val w = stage.canvas.width
val h = stage.canvas.height

// Define images
val manifest = js.Array(
  js.Dictionary("src" -> "background.png", "id" -> "background"),
  js.Dictionary("src" -> "knight.png", "id" -> "knight")
)

// Pre-load images
val loader = new LoadQueue(false)
loader.addEventListener("complete", (e: Object) => {
  // Assemble shapes on the stage
  val background = new Shape()
  background.graphics.beginBitmapFill(loader.getResult("background")).drawRect(0, 0, w, h)

  var spriteSheet = new SpriteSheet(js.Dictionary(
    "framerate" -> 30,
    "images"    -> js.Array(loader.getResult("knight")),
    "frames"    -> js.Dictionary("regX" -> -70, "height" -> 88, "count" -> 64, "regY" -> -60, "width" -> 74)
  ))
  val knight = new Sprite(spriteSheet);

  stage.addChild(background, knight);
  stage.update();
  true
}
```
