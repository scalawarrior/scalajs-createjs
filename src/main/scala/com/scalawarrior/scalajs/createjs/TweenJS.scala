package com.scalawarrior.scalajs.createjs

import scala.scalajs.js
import js.`|`
import js.annotation._

@js.native
@JSGlobal("createjs.CSSPlugin")
class CSSPlugin extends js.Object {
}

@js.native
@JSGlobal("createjs.CSSPlugin")
object CSSPlugin extends js.Object {
  var cssSuffixMap: Object = js.native
  def install(): Unit = js.native
}

@js.native
@JSGlobal("createjs.Ease")
class Ease extends js.Object {
}

@js.native
@JSGlobal("createjs.Ease")
object Ease extends js.Object {
  var backIn: js.Function1[Double, Double] = js.native
  var backInOut: js.Function1[Double, Double] = js.native
  var backOut: js.Function1[Double, Double] = js.native
  var bounceIn: js.Function1[Double, Double] = js.native
  var bounceInOut: js.Function1[Double, Double] = js.native
  var bounceOut: js.Function1[Double, Double] = js.native
  var circIn: js.Function1[Double, Double] = js.native
  var circInOut: js.Function1[Double, Double] = js.native
  var circOut: js.Function1[Double, Double] = js.native
  var cubicIn: js.Function1[Double, Double] = js.native
  var cubicInOut: js.Function1[Double, Double] = js.native
  var cubicOut: js.Function1[Double, Double] = js.native
  var elasticIn: js.Function1[Double, Double] = js.native
  var elasticInOut: js.Function1[Double, Double] = js.native
  var elasticOut: js.Function1[Double, Double] = js.native
  def get(amount: Double): js.Function1[Double, Double] = js.native
  def getBackIn(amount: Double): js.Function1[Double, Double] = js.native
  def getBackInOut(amount: Double): js.Function1[Double, Double] = js.native
  def getBackOut(amount: Double): js.Function1[Double, Double] = js.native
  def getElasticIn(amplitude: Double, period: Double): js.Function1[Double, Double] = js.native
  def getElasticInOut(amplitude: Double, period: Double): js.Function1[Double, Double] = js.native
  def getElasticOut(amplitude: Double, period: Double): js.Function1[Double, Double] = js.native
  def getPowIn(pow: Double): js.Function1[Double, Double] = js.native
  def getPowInOut(pow: Double): js.Function1[Double, Double] = js.native
  def getPowOut(pow: Double): js.Function1[Double, Double] = js.native
  var linear: js.Function1[Double, Double] = js.native
  var none: js.Function1[Double, Double] = js.native
  var quadIn: js.Function1[Double, Double] = js.native
  var quadInOut: js.Function1[Double, Double] = js.native
  var quadOut: js.Function1[Double, Double] = js.native
  var quartIn: js.Function1[Double, Double] = js.native
  var quartInOut: js.Function1[Double, Double] = js.native
  var quartOut: js.Function1[Double, Double] = js.native
  var quintIn: js.Function1[Double, Double] = js.native
  var quintInOut: js.Function1[Double, Double] = js.native
  var quintOut: js.Function1[Double, Double] = js.native
  var sineIn: js.Function1[Double, Double] = js.native
  var sineInOut: js.Function1[Double, Double] = js.native
  var sineOut: js.Function1[Double, Double] = js.native
}

@js.native
@JSGlobal("createjs.MotionGuidePlugin")
class MotionGuidePlugin extends js.Object {
}

@js.native
@JSGlobal("createjs.MotionGuidePlugin")
object MotionGuidePlugin extends js.Object {
  def install(): Object = js.native
}

@js.native
@JSGlobal("createjs.Timeline")
class Timeline protected () extends EventDispatcher {
  def this(tweens: js.Array[Tween], labels: Object, props: Object) = this()
  var duration: Double = js.native
  var ignoreGlobalPause: Boolean = js.native
  var loop: Boolean = js.native
  var position: Object = js.native
  def addLabel(label: String, position: Double): Unit = js.native
  def addTween(tween: Tween*): Unit = js.native
  def getCurrentLabel(): String = js.native
  def getLabels(): js.Array[Object] = js.native
  def gotoAndPlay(positionOrLabel: String | Double): Unit = js.native
  def gotoAndStop(positionOrLabel: String | Double): Unit = js.native
  def removeTween(tween: Tween*): Unit = js.native
  def resolve(positionOrLabel: String | Double): Double = js.native
  def setLabels(o: Object): Unit = js.native
  def setPaused(value: Boolean): Unit = js.native
  def setPosition(value: Double, actionsMode: Double = ???): Boolean = js.native
  def tick(delta: Double): Unit = js.native
  def updateDuration(): Unit = js.native
}

@js.native
@JSGlobal("createjs.Tween")
class Tween protected () extends EventDispatcher {
  def this(target: Object, props: Object = ???, pluginData: Object = ???) = this()
  var duration: Double = js.native
  var ignoreGlobalPause: Boolean = js.native
  var loop: Boolean = js.native
  var onChange: js.Function = js.native
  var passive: Boolean = js.native
  var pluginData: Object = js.native
  var position: Double = js.native
  var target: Object = js.native
  def call(callback: js.Function1[Tween, Any], params: js.Array[js.Any] = ???, scope: Object = ???): Tween = js.native
  def pause(tween: Tween): Tween = js.native
  def play(tween: Tween): Tween = js.native
  def set(props: Object, target: Object = ???): Tween = js.native
  def setPaused(value: Boolean): Tween = js.native
  def setPosition(value: Double, actionsMode: Double): Boolean = js.native
  def tick(delta: Double): Unit = js.native
  def to(props: Object, duration: Double = ???, ease: js.Function1[Double, Double] = ???): Tween = js.native
  def wait(duration: Double, passive: Boolean = ???): Tween = js.native
}

@js.native
@JSGlobal("createjs.Tween")
object Tween extends js.Object {
  var IGNORE: Object = js.native
  var LOOP: Double = js.native
  var NONE: Double = js.native
  var REVERSE: Double = js.native
  def get(target: Object, props: Object = ???, pluginData: Object = ???, `override`: Boolean = ???): Tween = js.native
  def hasActiveTweens(target: Object = ???): Boolean = js.native
  def installPlugin(plugin: Object, properties: js.Array[js.Any]): Unit = js.native
  def removeAllTweens(): Unit = js.native
  def removeTweens(target: Object): Unit = js.native
  def tick(delta: Double, paused: Boolean): Unit = js.native
}

@js.native
@JSGlobal("createjs.TweenJS")
class TweenJS extends js.Object {
}

@js.native
@JSGlobal("createjs.TweenJS")
object TweenJS extends js.Object {
  var buildDate: String = js.native
  var version: String = js.native
}
